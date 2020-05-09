package cwiczenia;

import java.util.Scanner;

public class RegExReplace {
    public static void main(String[] args) {
        System.out.println("The output will be this.");
        String sentence = "enter a word";

        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();

        String wordToBeReplaced = "output";
        String replacement = string;

        String newSentence = sentence.replace(wordToBeReplaced, replacement);
        System.out.println(sentence);
        System.out.println(newSentence);


    }
}
