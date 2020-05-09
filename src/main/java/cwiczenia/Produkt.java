package cwiczenia;

public class Produkt {
    private String nazwa;
    private double cenaNetto;

    public String getNazwa() {
        return nazwa;
    }

    public double getCenaNetto() {
        return cenaNetto;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCenaNetto(double cena) {
        this.cenaNetto = cena;
    }

    double vat = 0.08;
    double cenaBrutto = cenaNetto + vat;

    public double cenaBrutto() {
        return cenaBrutto;
    }
}
