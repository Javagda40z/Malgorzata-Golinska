package cwiczenia;

public class RegExLetters {
    public static void main(String[] args) {

        String zadanie4a = "PDUel";
        String zadanie4b = "KDPELSERO";
        String zadanie4c = "#LP8R";

        System.out.println(zadanie4a.matches("[a-zA-Z]{5}"));
        System.out.println(zadanie4b.matches("[a-zA-Z]{5}"));
        System.out.println(zadanie4c.matches("[a-zA-Z]{5}"));
    }
}