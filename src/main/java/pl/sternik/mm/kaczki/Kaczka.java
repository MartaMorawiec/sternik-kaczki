package pl.sternik.mm.kaczki;

import pl.sternik.mm.kaczki.ges.Ges;
import pl.sternik.mm.kaczki.ges.GesKaczkaAdapter;
import pl.sternik.mm.kaczki.kwakanie.Kwakanie;
import pl.sternik.mm.kaczki.kwakanie.Niemowa;
import pl.sternik.mm.kaczki.latanie.Latanie;


public abstract class Kaczka implements Latanie, Kwakanie {
    private final String nazwa;
    private Latanie latanie;
    private Kwakanie kwakanie;


    public Kaczka(String nazwa, Latanie latanie, Kwakanie kwakanie) {
        super();
        this.nazwa = nazwa;
        this.latanie = latanie;
        this.kwakanie = kwakanie;
    }

    public void kwacz() {
        kwakanie.kwacz();
    }

    public void lataj() {
        latanie.lataj();
    }

    public void wyswietl() {
        System.out.println("Jestem " + nazwa);
    }

    public void plywaj() {
        System.out.println("Pływam sobie");
    }


//    public void nauczLatac() {
//        System.out.println("Nauka latania w toku...");
//        setLatanie(new Latajaca());
//        lataj();
//    }

    public Latanie getLatanie() {
        return latanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    public Kwakanie getKwakanie() {
        return kwakanie;
    }

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }

    public static Kaczka dajKaczke(KaczkaTypy typ, String name) {
        switch (typ) {
            case Dzika:
                return new DzikaKaczka(name);

            case Mandarynka:
                return new MandarynkaKaczka(name);

            case Drewniana:
                return new DrewnianaKaczka(name);

            case Gumowa:
                return new GumowaKaczka(name);

            case ZepsutaGumowa:
                GumowaKaczka gumowaKaczka = new GumowaKaczka(name);
                gumowaKaczka.setKwakanie(new Niemowa());
                return gumowaKaczka;

            case Ges:
                return new GesKaczkaAdapter(new Ges(name));

            default:
                return new DzikaKaczka("Dzika domyślna");
        }
    }
}