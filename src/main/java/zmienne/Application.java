package zmienne;

import org.w3c.dom.ls.LSOutput;

public class Application {
    public static void main(String[] args) {
        int i = 5;
        double d = 5.1;
        float f = 10;

        System.out.println(i);
        System.out.println(d);
        System.out.println(f);

        System.out.println(i*d);

        i = (int) d;
        System.out.println(i);
        d = i;

        System.out.println(czyParzysta(4));
        System.out.println(czyParzysta(3));
    }

    public static int dodaj(int a, int b) {
        return a+b;

    }

    public static boolean czyParzysta(int a) {
        return a % 2 == 0;
    }

}
