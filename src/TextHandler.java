import java.io.IOException;
import java.io.*;
import java.util.Iterator;

public class TextHandler {
    private final String filePath;
    private String stringFromBuilder;
    private int countingWordInFile;

    public TextHandler(String filePath) {
        this.filePath = filePath;
        getTextFromFile();
    }

    private void getTextFromFile() {
        StringBuilder textFromFile = new StringBuilder();
        try (FileInputStream fin = new FileInputStream(filePath)) {
            int iterator;
            while ((iterator = fin.read()) != -1) {
                textFromFile.append((char) iterator);
            }
            stringFromBuilder = textFromFile.toString();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void changeCase(boolean toUpperCase) {
        byte[] buffer = (toUpperCase ? stringFromBuilder.toUpperCase() : stringFromBuilder.toLowerCase()).getBytes();
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void countingWords() {
        for (String stringFromText : stringFromBuilder.split("\n")) {
            if (!stringFromText.isEmpty()) {
                countingWordInFile += stringFromText.split(" ").length;
            }
        }
        System.out.println(countingWordInFile);
    }

    public void countingSymbolInWord() {

    }
}
