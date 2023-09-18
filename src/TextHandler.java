import java.io.IOException;
import java.io.*;
import java.util.Iterator;

public class TextHandler {
    private final String filePath;
    private final StringBuilder textFromFile = new StringBuilder();

    public TextHandler(String filePath) {
        this.filePath = filePath;
        getTextFromFile();
    }

    private void getTextFromFile() {
        try (FileInputStream fin = new FileInputStream(filePath)) {
            int iterator;
            while ((iterator = fin.read()) != -1) {
                textFromFile.append((char) iterator);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void changeCase(boolean toUpperCase) {
        byte[] buffer = (toUpperCase ? textFromFile.toString().toUpperCase() : textFromFile.toString().toLowerCase()).getBytes();
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            fos.write(buffer);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void countingWords() {

    }

    public void countingSymbolInWord() {

    }
}
