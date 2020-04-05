package zadania;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Ciagi {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        sumaLiczbZListy(lista);
        sumaLiczbZListy(lista2);

        System.out.println(lista);
        lista.add(444);
        System.out.println(lista);
        lista.add(35);
        lista.remove(0);
        System.out.println(lista);

    }

    public static int sumaLiczbZListy(List<Integer> lista) {
        return 0;
    }

    public static List<Integer> stworzCiagArytmetyczny (int dlugosc, int pierwszy, int roznica) {
        List<Integer> ciag = new ArrayList<>();
        ciag.add(pierwszy);
        for (int i = pierwszy; i < dlugosc; i++) {
            ciag.add(pierwszy + i * roznica);
        }
        return ciag;
    }

    public static boolean sprawdzCzyCiagJestArytmetyczny(List<Integer> ciag) {
        for (int i = 1; i < ciag.size(); i++) {
            if((ciag.get(i-1) + ciag.get(i+1)) / 2 != ciag.get(i)) {
                return false;
            }
        }
        return true;
    }
}
