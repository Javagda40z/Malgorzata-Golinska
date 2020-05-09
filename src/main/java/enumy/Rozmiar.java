package enumy;

public enum Rozmiar {
    S(10, 20), M(20, 30), L(30,40), XL(40,50);

    private int dlugosc;
    private int szerokosc;

    Rozmiar(int dlugosc, int szerokosc) {
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }
}
