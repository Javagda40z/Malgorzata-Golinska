package cwiczenia;

import java.util.Scanner;

public class RegExSentence {
    public static void main(String[] args) {

        String zdanie1 = "To jest całkiem poprawne zdanie.";
        String zdanie2 = "ie, to nie jest zdanie.";

        String regExpres = "[\"’]?[A-Z][^.?!]+((?![.?!][’\"]?\\s[\"’]?[A-Z][^.?!]).)+[.?!’\"]+";
        // ["’]?[A-Z][^.?!] - pierwsze słowo napisane z dużej litery
        // [^.?!] - każdy znak (łącznie ze spacją) z wyjątkiem kropki, znaku zapytania i wykrzyknika
        // [.?!] - jedynie kropka, znak zapytania lub wykrzyknik
        // ((?![.?!][’"]?\s["’]?[A-Z][^.?!]).) - wszystkie znaki w zdaniu
        // [.?!’"] - ostatni znak

        if (zdanie1.matches(regExpres)) {
            System.out.println("Tak, to jest poprawne zdanie.");
        } else {
            System.out.println("nie, to nie jest poprawne zdanie");
        }

        if (zdanie2.matches(regExpres)) {
            System.out.println("Tak, to jest poprawne zdanie.");
        } else {
            System.out.println("nie, to nie jest poprawne zdanie");
        }
    }
}