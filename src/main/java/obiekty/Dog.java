package obiekty;

public class Dog implements Animal {

    private String imie;

    public Dog(String imie) {
        this.imie = imie;
    }

    public void aportuj() {
        // pies aportuje
    }

    @Override
    public void makeSound() {
        System.out.println("hau hau!");
    }

    @Override
    public void move() {
        System.out.println("chodzę");
    }

    public String getImie() {
        return imie;
    }
}
