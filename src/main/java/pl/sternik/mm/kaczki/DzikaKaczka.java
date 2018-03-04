package pl.sternik.mm.kaczki;

import pl.sternik.mm.kaczki.kwakanie.Kwaczka;
import pl.sternik.mm.kaczki.latanie.Latajaca;

public class DzikaKaczka extends Kaczka{
    public DzikaKaczka(String nazwa) {
        super("Dzika: " + nazwa, new Latajaca(), new Kwaczka());
    }
}

