package dziedziczenie;

public class Bramkarz extends Zawodnik implements Sprinter{
    public void bron() {
        System.out.println("bronię bramki");
    }

    @Override
    public void kopnij() {
        System.out.println("złap piłkę");
    }

    @Override
    public void sprint() {
        System.out.println("sprintuje powoli");
    }
}
