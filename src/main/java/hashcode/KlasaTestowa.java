package hashcode;

public class KlasaTestowa {
    public static void main(String[] args) {
        String text = "tekst";
        String text2 = new String("tekst");

        //System.out.println(text == text2);

        //

//        Człowiek czlowiek1 = new Człowiek("Mateusz", 99);
//        Człowiek czlowiek2 = new Człowiek("Mateusz", 99);
//        Człowiek czlowiek3 = new Człowiek("X", 99);
//
//        System.out.println(czlowiek1 == czlowiek2);
//        System.out.println(czlowiek1.equals(czlowiek2));

        Człowiek czlowiek4 = new SuperCzlowiek("Super", 88);

    }
}
