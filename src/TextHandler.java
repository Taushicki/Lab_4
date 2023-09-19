import java.io.IOException;
import java.io.*;

public class TextHandler {
    private final String inputFileName;
    private final String outputFileName;

    public TextHandler(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
    }

    public void changeCase(boolean toUpperCase) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String lineFromTextFile;
            while ((lineFromTextFile = reader.readLine()) != null) {
                writer.write(toUpperCase ? lineFromTextFile.toUpperCase() : lineFromTextFile.toLowerCase());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void countWords() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String lineFromTextFile;
            int wordCountInFile = 0;
            while ((lineFromTextFile = reader.readLine()) != null) {
                wordCountInFile += (!lineFromTextFile.isEmpty()) ? lineFromTextFile.split(" ").length : 0;
            }
            writer.write(String.valueOf(wordCountInFile));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void countCharactersPerWord() {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String lineFromTextFile;
            while ((lineFromTextFile = reader.readLine()) != null) {
                for (String wordFromLine : lineFromTextFile.split(" ")) {
                    writer.write(String.valueOf(wordFromLine.length()));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
