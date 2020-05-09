package bramka;

import Parking.Pojazd;

public interface Szlaban {

    void wjazd(Pojazd pojazd);
    void wyjazd(Pojazd pojazd, int zaplata);
}
