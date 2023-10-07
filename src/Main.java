public class Main {
    public static void main(String[] args){
        String inputFile = "txtFiles/input.txt";
        String outputFile = "txtFiles/output.txt";
        TextHandler file = new TextHandler(inputFile, outputFile);
        file.changeCase(true);
        file.countWords();
        file.countCharactersPerWord();


    }
}