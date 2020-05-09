package enumy.zadanie;

import cwiczenia.Produkt;

public enum ProductType {
    OWOCE("owoce", 123), WARZYWA("warzywa", 124), NABIAL("nabiał", 125);

    private String nazwa;
    private int code;

    ProductType(String nazwa, int code) {
        this.nazwa = nazwa;
        this.code = code;
    }
}
