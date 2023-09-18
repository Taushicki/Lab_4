import org.w3c.dom.Text;

import java.io.*;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        TextHandler someText = new TextHandler("temp.txt");
        someText.changeCase(true);
        someText.countingWords();


    }
}