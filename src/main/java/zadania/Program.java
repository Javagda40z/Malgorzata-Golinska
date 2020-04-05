package zadania;

import org.w3c.dom.ls.LSOutput;

public class Program {
    public static void main(String[] args) {
        //Program program = new Program();
        //program.tabliczkaMnozenia(5);

        //TabliczkaMnozenia tabliczkaMnozenia = new TabliczkaMnozenia(5);
        //System.out.println(tabliczkaMnozenia.getLiczba());
        //tabliczkaMnozenia.wypiszTabliczke();

        //tabliczkaMnozenia = new TabliczkaMnozenia(10);
        //tabliczkaMnozenia.wypiszTabliczke();

        System.out.println(sumaLiczb(3,6));
    }


    public void tabliczkaMnozenia(int liczba) {
        System.out.println("mnożenie liczby " + liczba);
        for(int i = 1; i <= 5; i++){
            System.out.println(liczba + " x " + i + " = " + liczba * i);
        }

    }

    public static int sumaLiczb(int x, int y) {
        int suma = 0;
        for(int i = x; i < y; i++) {
            suma = suma + i;
        }
        return suma;
    }

}
