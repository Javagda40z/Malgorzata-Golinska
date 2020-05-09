package Parking;

import bramka.Bramka;
import bramka.KalkulatorOplat;
import bramka.Raport;
import bramka.RejestrPojazdow;

public class Application {

        public static void main(String[] args) {
            RejestrPojazdow rejestrPojazdow = new RejestrPojazdow();
            Bramka bramka = new Bramka(rejestrPojazdow);
            bramka.setKalkulatorOplat((new KalkulatorOplat()));

            Motocykl motocykl = new Motocykl("GA12345", Paliwo.BENZYNA);
            Samochod samochod = new Samochod("GD2345", Paliwo.BENZYNA);
            Autobus autobus = new Autobus("GA93847", Paliwo.BENZYNA);

            bramka.wjazd(motocykl);
            bramka.wjazd(samochod);
            bramka.wjazd(autobus);

            bramka.wyjazd(samochod, 10);
            bramka.wyjazd(autobus, 100);

            Raport raport = bramka.przygotujRaport();
            raport.wyswietl();
        }
    }

