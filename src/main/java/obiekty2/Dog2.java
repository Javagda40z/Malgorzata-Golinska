package obiekty2;

public class Dog2 extends Animal2{

    public Dog2(String imie) {
        super(imie); // super - wywołanie konstruktora klasy nadrzędnej
    }

    @Override
    void makeSound() {
        System.out.println("hau");
    }

    @Override
    public void move() {
        System.out.println("chodzę");
    }
}
