package obiekty;

public class Cat implements Animal {

    private int licznikZlapanychMyszy;
    private String imie;

    public Cat() {
        this("jakieś imię");
    }

    public Cat(String imie) {
        this.imie = imie;
    }

    public void drap() {
        // kot drapie
    }

    public void eatMice() {
        licznikZlapanychMyszy++;
        System.out.println("zjadłem " + licznikZlapanychMyszy + " myszy");
    }

    @Override
    public void makeSound() {
        System.out.println("miau!");
    }

    @Override
    public void move() {
        System.out.println("chodzę");
    }

    public String getImie() {
        return imie;
    }
}
