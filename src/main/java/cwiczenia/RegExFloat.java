package cwiczenia;

public class RegExFloat {
    public static void main(String[] args) {
        String liczba1 = "8";
        String liczba2 = "7";

        String regExpres = "([0-9]*[.,][0-9]+)";
        // ["’]?[A-Z][^.?!] - pierwsze słowo napisane z dużej litery
        // [^.?!] - każdy znak (łącznie ze spacją) z wyjątkiem kropki, znaku zapytania i wykrzyknika
        // [.?!] - jedynie kropka, znak zapytania lub wykrzyknik
        // ((?![.?!][’"]?\s["’]?[A-Z][^.?!]).) - wszystkie znaki w zdaniu
        // [.?!’"] - ostatni znak

        if (liczba1.matches(regExpres)) {
            System.out.println("Tak, to jest liczba zmiennoprzecinkowa.");
        } else {
            System.out.println("nie, to nie jest liczba zmiennoprzecinkowa");
        }

        if (liczba2.matches(regExpres)) {
            System.out.println("Tak, to jest poprawne zdanie.");
        } else {
            System.out.println("nie, to nie jest poprawne zdanie");
        }
    }
}

