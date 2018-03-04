package pl.sternik.mm.kaczki;

import pl.sternik.mm.kaczki.kwakanie.Niemowa;
import pl.sternik.mm.kaczki.latanie.Nielot;

public class DrewnianaKaczka extends Kaczka {
    public DrewnianaKaczka(String nazwa) {
        super("Drewaniana: " + nazwa, new Nielot(), new Niemowa());
    }
}
