package cwiczenia;

public class Tablice {
    public static void main(String[] args) {
        int[] tab1 = {6, 3, 5, 7, 1, 1, 7, 9};
        double suma1 = 0;
        for (int i = 0; i < tab1.length; i++) {
            suma1 += tab1[i];
        }
        System.out.println("suma elementów z tablicy 1: " + suma1);

        double iloraz = suma1 / tab1.length;
        System.out.println("średnia elementów tablicy 1: " + iloraz);
    //
        int max = tab1[0];
        for (int i = 1; i < tab1.length; i++) {
            if (tab1[i] > max)
                max = tab1[i];
            }
            System.out.println("największy element: " + max);
        //
        int min = tab1[0];
        for (int i = 1; i < tab1.length; i++) {
            if (tab1[i] < min)
                min = tab1[i];
            }
            System.out.println("najmniejszy element: " + min);
        //
        int[] tab2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int suma2 = 0;
        for(int i = 0; i < tab2.length; i++) {
            suma2 += tab2[i];
            }
            System.out.println("suma elementów tablicy 2: " + suma2);
        //
        double sumaTablic = suma1 + suma2;
        System.out.println("suma elementów obu tablic: " + sumaTablic);
        //
        double iloczyn;
        iloczyn = suma1 * suma2;
        System.out.println("iloczyn sum elementów dwóch tablic: " + iloczyn);

        }
    }

