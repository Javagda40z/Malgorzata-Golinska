package bramka;

import Parking.Paliwo;
import Parking.Pojazd;
import util.KalkulatorUtil;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import static Parking.Paliwo.PRAD;
import static Parking.Typ.OSOBOWY;

public class KalkulatorOplat {

    public static int OPLATA = 2;

    public int policz(Wjazd wjazd) {
        LocalDateTime dataWjazdu = wjazd.getDataWjazdu();
        LocalDateTime dataWyjazdu = LocalDateTime.now();
        //Duration between = Duration.between(dataWjazdu, dataWyjazdu);
        Pojazd pojazd = wjazd.getPojazd();
        long czasNaParkingu = ChronoUnit.HOURS.between(dataWjazdu, dataWyjazdu);

        czasNaParkingu = czasNaParkingu + KalkulatorUtil.randomHourBetween(1, 24); //tylko do testu

        if (czasNaParkingu < 1 || Paliwo.PRAD.equals(pojazd.getPaliwo())) {
            return 0;
        }
        double mnoznik = policzMnoznik(pojazd);
        return (int) (OPLATA * mnoznik * czasNaParkingu);
    }

    private double policzMnoznik(Pojazd pojazd) {
        double mnoznik = 1;
        switch (pojazd.getTyp()) {
            case OSOBOWY:
                mnoznik=mnoznik * 1;
                break;

            case MOTOCYKL:
                mnoznik=mnoznik * 0.5;
                break;

            case CIEZAROWY:
                mnoznik=mnoznik * 2;
                break;

            default:
                break;
        }

        return mnoznik;
    }
}
