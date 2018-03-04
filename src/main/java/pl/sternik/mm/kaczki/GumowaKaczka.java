package pl.sternik.mm.kaczki;

import pl.sternik.mm.kaczki.kwakanie.Piskajaca;
import pl.sternik.mm.kaczki.latanie.Nielot;

public class GumowaKaczka extends Kaczka {

    public GumowaKaczka(String nazwa) {
        super("Gumowa: "+nazwa, new Nielot(), new Piskajaca());
    }
}