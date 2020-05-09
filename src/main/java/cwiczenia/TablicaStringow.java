package cwiczenia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TablicaStringow {
    public static void main(String[] args) {

        String[] imiona = new String[] {"mateusz", "kasia", "adam", "tomek", "andrzej"};
        System.out.println(Arrays.toString(imiona));
        System.out.println("tablica zawiera " + imiona.length + " imion");
        //
        imiona[0] = "piotr";
        System.out.println(Arrays.toString(imiona));
        //
        //zmiana na duże litery
        //
        ArrayList<String> imiona2 = new ArrayList<String >(Arrays.asList(imiona));
        imiona2.remove(imiona[2]);
        System.out.println(imiona2);

        //
        System.out.println(imiona2.size());

    }
}
