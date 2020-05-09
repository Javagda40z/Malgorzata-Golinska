package hashcode;

public class SuperCzlowiek extends Człowiek{
    int cos;

    public SuperCzlowiek(String imię, int wiek, int cos) {
        super(imię, wiek);
        this.cos = cos;
    }

    public void setCos(int cos) {
        this.cos = cos;
    }

    public int getCos() {
        return cos;
    }

    public SuperCzlowiek(String imie, int wiek) {
        super(imie, wiek);
    }
}
