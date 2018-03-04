package pl.sternik.mm.kaczki;

import pl.sternik.mm.kaczki.kwakanie.Kwaczka;
import pl.sternik.mm.kaczki.latanie.Latajaca;

public class MandarynkaKaczka extends Kaczka {
    public MandarynkaKaczka(String nazwa) {
        super("Mandarynka: " + nazwa, new Latajaca(), new Kwaczka());
    }
}
