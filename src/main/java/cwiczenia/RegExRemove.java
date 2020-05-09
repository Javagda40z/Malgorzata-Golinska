package cwiczenia;

public class RegExRemove {
    public static void main(String[] args) {
        String sentence = "lorem ipsum dolor sit amet consectetur adipiscing elit";
        sentence = sentence.replaceAll("\\s+", "");

        System.out.println(sentence);
    }
}