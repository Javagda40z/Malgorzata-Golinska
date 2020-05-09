package dziedziczenie;

public class Pilkarz extends Zawodnik implements Sprinter {
    public void strzelajBramke() {
        System.out.println("strzelam bramkę");
    }

    @Override
    public void kopnij() {
        System.out.println("kopnij mocno");
    }

    @Override
    public void sprint() {
        System.out.println("sprintuje szybko");
    }
}
