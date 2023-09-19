public class Main {
    public static void main(String[] args){
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        TextHandler file = new TextHandler(inputFile, outputFile);
        file.changeCase(true);
//        file.countWords();
//        file.countCharactersPerWord();


    }
}