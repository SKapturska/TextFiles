package textfiles;

import java.io.File;

public class TextFiles {

    public static void main(String[] args) {

        FileRead fr = new FileRead();
        System.out.println("Liczba wierszy: " + fr.countLines(new File("plik.txt")));
        System.out.println("Liczba słów: " + fr.countWords(new File("plik.txt")));
    }

}
