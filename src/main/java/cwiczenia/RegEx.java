package cwiczenia;

import java.util.Scanner;

public class RegEx {
    public static void main(String[] args) {

        System.out.println("wpisz kilka liczb:");
        Scanner inputScanner = new Scanner(System.in);
        String number = inputScanner.nextLine();

        if (number.contains("[^0-9]")) {
            System.out.println("String zawiera nie tylko liczby.");
        } else {
            System.out.println("String zawiera tylko liczby");
        }
    }
}

