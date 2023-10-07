import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

class TextHandlerTest {
    private final String inputFile = "txtFiles/input.txt";
    private final String outputFile = "txtFiles/output.txt";
    private final TextHandler file = new TextHandler(inputFile, outputFile);

    @org.junit.jupiter.api.Test
    void changeCase() throws IOException {
        file.changeCase(true);
        String changeCaseTestFile = "txtFiles/changecase.txt";
        assertTrue(FileUtils.contentEquals(new File(outputFile), new File(changeCaseTestFile)));
    }

    @org.junit.jupiter.api.Test
    void countWords() throws IOException {
        file.countWords();
        String countWordsTestFile = "txtFiles/countwords.txt";
        assertTrue(FileUtils.contentEquals(new File(outputFile), new File(countWordsTestFile)));
    }

    @org.junit.jupiter.api.Test
    void countCharactersPerWord() throws IOException {
        file.countCharactersPerWord();
        String countCharactersPerWordTestFile = "txtFiles/countcharactersperword.txt";
        assertTrue(FileUtils.contentEquals(new File(outputFile), new File(countCharactersPerWordTestFile)));
    }
}