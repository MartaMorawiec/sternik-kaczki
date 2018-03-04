package pl.sternik.mm.kaczki.ges;

import pl.sternik.mm.kaczki.Kaczka;
import pl.sternik.mm.kaczki.kwakanie.Niemowa;
import pl.sternik.mm.kaczki.latanie.Nielot;

public class GesKaczkaAdapter extends Kaczka {
    private Ges ges;

    public GesKaczkaAdapter(Ges ges) {
        super("", new Nielot(), new Niemowa());
        this.ges = ges;
    }

    @Override
    public void wyswietl() {
        ges.wyswietlGes();
    }

    @Override
    public void plywaj() {
        ges.plywajPoGesiemu();
    }

    @Override
    public void lataj() {
        ges.latajPoGesiemu();
    }

    @Override
    public void kwacz() {
        ges.gegaj();
    }

    public Ges getGes() {
        return ges;
    }

    public void setGes(Ges ges) {
        this.ges = ges;
    }
}