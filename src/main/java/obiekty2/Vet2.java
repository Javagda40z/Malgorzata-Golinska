package obiekty2;

import obiekty.Cat;

public class Vet2 {
    public void sayHello(Animal2 zwierze) {
        System.out.println("Hej, " + zwierze.getImie());

    }

    public static void main(String[] args) {
        Animal2 kot = new Cat2("Horus");
        Animal2 pies = new Dog2("Maxi");

        Vet2 weterynarz = new Vet2();
        weterynarz.sayHello(kot);
        weterynarz.sayHello(pies);

        Animal2 chomik = new Hamster("Gutek");
        weterynarz.sayHello(chomik);
    }
}
