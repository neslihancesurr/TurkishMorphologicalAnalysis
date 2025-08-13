import AnnotatedSentence.*;
import DependencyParser.Universal.UniversalDependencyTreeBankCorpus;
import DependencyParser.Universal.UniversalDependencyTreeBankSentence;
import DependencyParser.Universal.UniversalDependencyTreeBankWord;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class FeatureComparisonMain {

        private static UniversalDependencyTreeBankSentence generateSentence(UniversalDependencyTreeBankSentence sentence) {
        int splitIndex = 0;
        UniversalDependencyTreeBankSentence s = new UniversalDependencyTreeBankSentence();
        for (int i = 0; i < sentence.wordCount(); i++) {
            UniversalDependencyTreeBankWord treeBankWord = (UniversalDependencyTreeBankWord) sentence.getWord(i);
            if (splitIndex < sentence.splitSize()) {
                String[] split = sentence.getSplit(splitIndex).split("-");
                if (Integer.parseInt(split[0]) == treeBankWord.getId()) {
                    int difference = Integer.parseInt(split[1]) - Integer.parseInt(split[0]);
                    i += difference;
                    splitIndex++;
                }
            }
            if (!treeBankWord.isPunctuation()) {
                s.addWord(treeBankWord);
            }
        }
        return s;
    }

        private static void checkForFeatures(String s1, String s2, ArrayList<String> f1, String f2, BufferedWriter writer, String fileName) throws
        IOException {
        String[] features = f2.split("\\|");
        HashSet<String> featuresSet = new HashSet<>(Arrays.asList(features));
        HashSet<String> intersect = new HashSet<>();
        featuresSet.remove("_");
        for (int i = 0; i < f1.size(); i++) {
            if (featuresSet.contains(f1.get(i))) {
                intersect.add(f1.get(i));
                featuresSet.remove(f1.get(i));
                f1.remove(i);
                i--;
            }
        }
        if (!f1.isEmpty() || !featuresSet.isEmpty()) {
            writer.write(fileName + "\t" + s1 + "\t" + f1 + "\t" + s2 + "\t" + featuresSet + "\t" + intersect);
            writer.newLine();
        }
    }

        private static void checkForWords(AnnotatedSentence sentence, UniversalDependencyTreeBankSentence treeBankSentence, BufferedWriter wordsRootWriter, BufferedWriter wordsFeatureWriter) throws IOException {
        AnnotatedSentence s1 = new AnnotatedSentence();
        for (int i = 0; i < sentence.wordCount(); i++) {
            if (!sentence.getWord(i).isPunctuation()) {
                s1.addWord(sentence.getWord(i));
            }
        }
        HashSet<Integer> splitIndex = new HashSet<>();
        for (int i = 0; i < treeBankSentence.splitSize(); i++) {
            splitIndex.add(Integer.parseInt(treeBankSentence.getSplit(i).substring(0, treeBankSentence.getSplit(i).indexOf("-"))));
        }
        treeBankSentence = generateSentence(treeBankSentence);
        if (treeBankSentence.wordCount() == s1.wordCount()) {
            for (int i = 0; i < s1.wordCount(); i++) {
                AnnotatedWord word = (AnnotatedWord) s1.getWord(i);
                UniversalDependencyTreeBankWord treeBankWord = (UniversalDependencyTreeBankWord) treeBankSentence.getWord(i);
                if (!splitIndex.contains(treeBankWord.getId())) {
                    if (word.getParse() != null) {
                        if (!word.getParse().getWord().getName().equalsIgnoreCase(treeBankWord.getLemma())) {
                            wordsRootWriter.write(sentence.getFileName() + "\t" + word.getName() + "\t" + word.getParse().getWord().getName() + "\t" + treeBankWord.getLemma());
                            wordsRootWriter.newLine();
                        }
                        checkForFeatures(word.getName(), treeBankWord.getName(), word.getParse().getUniversalDependencyFeatures(word.getParse().getUniversalDependencyPos()), treeBankWord.getFeatures().toString(), wordsFeatureWriter, sentence.getFileName());
                    }
                }
            }
        } else {
            System.out.println(sentence.getFileName() + ": sentence sizes are different.");
        }
    }

        public static void main(String[] args) throws IOException {
        String fileName = "pud";
        BufferedWriter wordsRootWriter = new BufferedWriter(new FileWriter("WordsRoots-" + fileName));
        BufferedWriter wordsFeatureWriter = new BufferedWriter(new FileWriter("WordsFeature-" + fileName));
        int trainI = 0, testI = 0, devI = 0;
        UniversalDependencyTreeBankCorpus train = null;
        UniversalDependencyTreeBankCorpus test = null;
        UniversalDependencyTreeBankCorpus dev = null;
        try {
            train = new UniversalDependencyTreeBankCorpus("tr_"+ fileName + "-ud-train.conllu");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            test = new UniversalDependencyTreeBankCorpus("tr_"+ fileName + "-ud-test.conllu");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        try {
            dev = new UniversalDependencyTreeBankCorpus("tr_"+ fileName + "-ud-dev.conllu");
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
        AnnotatedCorpus corpus = new AnnotatedCorpus(new File("/Users/oguzkeremyildiz/Dropbox/" + (fileName.charAt(0) + "").toUpperCase(new Locale("en")) + fileName.substring(1) + "/Turkish-Phrase"));
        for (int i = 0; i < corpus.sentenceCount(); i++) {
            AnnotatedSentence sentence = (AnnotatedSentence) corpus.getSentence(i);
            System.out.println(sentence.getFileName());
            if (sentence.getFileName().contains("dev")) {
                UniversalDependencyTreeBankSentence devSentence = (UniversalDependencyTreeBankSentence) dev.getSentence(devI);
                checkForWords(sentence, devSentence, wordsRootWriter, wordsFeatureWriter);
                devI++;
            } else if (sentence.getFileName().contains("train")) {
                UniversalDependencyTreeBankSentence trainSentence = (UniversalDependencyTreeBankSentence) train.getSentence(trainI);
                checkForWords(sentence, trainSentence, wordsRootWriter, wordsFeatureWriter);
                trainI++;
            } else if (sentence.getFileName().contains("test")) {
                UniversalDependencyTreeBankSentence testSentence = (UniversalDependencyTreeBankSentence) test.getSentence(testI);
                checkForWords(sentence, testSentence, wordsRootWriter, wordsFeatureWriter);
                testI++;
            }
        }
        wordsFeatureWriter.close();
        wordsRootWriter.close();
    }
}
