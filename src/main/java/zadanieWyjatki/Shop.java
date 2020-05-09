package zadanieWyjatki;

public class Shop {

    private int iloscVodki;

    public void sellVodka(Person person) throws InvalidAgeException, NoVodkaException {

        if (person.getAge() < 18) {
            throw new InvalidAgeException("koles nie masz 18 lat");
        }
        if (iloscVodki == 0) {
            throw new NoVodkaException("brak wodki");
        }

        iloscVodki--; // iloscVodki = iloscVodki - 1;
        System.out.println("sold");

    }

    public Shop(int iloscVodki) {
        this.iloscVodki = iloscVodki;
    }
}
