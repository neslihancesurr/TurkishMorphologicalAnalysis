import AnnotatedSentence.AnnotatedCorpus;

import java.io.File;
import java.util.Locale;

public class ConvertConllu {

    public static void main(String[] args) {
        convertToConnlu("pud");
        convertToConnlu("boun");
        convertToConnlu("gb");
        convertToConnlu("imst2");


    }
    public static void convertToConnlu(String fileName){
        AnnotatedCorpus corpus = new AnnotatedCorpus(new File("/Users/neslihancesur/Dropbox/" + (fileName.charAt(0) + "").toUpperCase(new Locale("en")) + fileName.substring(1) + "/Turkish-Phrase"), ".train");
        corpus.exportUniversalDependencyFormat("tr_"+fileName+"-ud-train.conllu");
        corpus = new AnnotatedCorpus(new File("/Users/neslihancesur/Dropbox/" + (fileName.charAt(0) + "").toUpperCase(new Locale("en")) + fileName.substring(1) + "/Turkish-Phrase"), ".test");
        corpus.exportUniversalDependencyFormat("tr_"+fileName+"-ud-test.conllu");
        corpus = new AnnotatedCorpus(new File("/Users/neslihancesur/Dropbox/" + (fileName.charAt(0) + "").toUpperCase(new Locale("en")) + fileName.substring(1) + "/Turkish-Phrase"), ".dev");
        corpus.exportUniversalDependencyFormat("tr_"+fileName+"-ud-dev.conllu");
    }
}
