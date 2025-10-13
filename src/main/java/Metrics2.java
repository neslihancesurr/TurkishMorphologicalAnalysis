import AnnotatedSentence.*;
import AnnotatedSentence.AnnotatedCorpus;
import AnnotatedSentence.AnnotatedSentence;
import DependencyParser.Universal.UniversalDependencyTreeBankCorpus;
import DependencyParser.Universal.UniversalDependencyTreeBankSentence;
import DependencyParser.Universal.UniversalDependencyTreeBankWord;

import java.io.*;
import java.util.*;

public class Metrics2 {

    public static void main(String[] args) throws IOException {
        String fileName = "pud";
        String outputDir = "results/metrics/";  // <-- change this to your desired folder
        String outputCsvName = outputDir + fileName + "_metrics.csv";

        processFile("resources/tr_" + fileName + "-ud-train.conllu", "metrics/"+fileName+"train_original.csv");
        processFile("resources/tr_" + fileName + "-ud-test.conllu", "metrics/"+fileName+"test_original.csv");
        processFile("resources/tr_" + fileName + "-ud-dev.conllu", "metrics/"+fileName+"dev_original.csv");

        processFile("tr_" + fileName + "-ud-train.conllu", "metrics/"+fileName+"train_ourversion.csv");
        processFile("tr_" + fileName + "-ud-test.conllu", "metrics/"+fileName+"test_ourversion.csv");
        processFile("tr_" + fileName + "-ud-dev.conllu", "metrics/"+fileName+"dev_ourversion.csv");
    }

    public static void processFile(String inputPath, String outputCsvName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputPath))) {
            Map<String, Integer> featureCounts = new HashMap<>();
            int tokenCount = 0;
            int sentenceCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty()) {
                    sentenceCount++;
                    continue;
                }

                if (line.startsWith("#")) continue;

                tokenCount++;
                String[] cols = line.split("\t");
                if (cols.length >= 6) {
                    String feats = cols[5].trim();
                    if (!feats.equals("_")) {
                        String[] featArray = feats.split("\\|");
                        for (String feat : featArray) {
                            featureCounts.put(feat, featureCounts.getOrDefault(feat, 0) + 1);
                        }
                    }
                }
            }

            double avgTokens = (sentenceCount > 0) ? (double) tokenCount / sentenceCount : 0.0;

            writeCsv(outputCsvName, tokenCount, sentenceCount, avgTokens, featureCounts);
            System.out.println("✅ Metrics saved to: " + outputCsvName);

        } catch (FileNotFoundException e) {
            System.err.println("❌ File not found: " + inputPath);
        } catch (IOException e) {
            System.err.println("❌ Error reading file: " + inputPath);
            e.printStackTrace();
        }
    }

    private static void writeCsv(String outputCsvName, int tokenCount, int sentenceCount,
                                 double avgTokens, Map<String, Integer> featureCounts) throws IOException {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputCsvName))) {
            // Write summary section
            writer.write("Metric,Value\n");
            writer.write("Total tokens," + tokenCount + "\n");
            writer.write("Total sentences," + sentenceCount + "\n");
            writer.write("Average tokens per sentence," + String.format("%.2f", avgTokens) + "\n\n");

            // Write feature frequency table
            writer.write("Feature,Count\n");
            featureCounts.entrySet().stream()
                    .sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue()))
                    .forEach(e -> {
                        try {
                            writer.write(e.getKey() + "," + e.getValue() + "\n");
                        } catch (IOException ex) {
                            throw new UncheckedIOException(ex);
                        }
                    });
        }
    }
}
