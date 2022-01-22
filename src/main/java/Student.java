public class Student {
    int wiek;

    public int getWiek() {
        return wiek;
    }

    public Student setWiek(int wiek) {
        this.wiek = wiek;
        return this;
    }

    String imie;
    String nazwisko;
    int indeks;
    boolean pełnoletni;
    private Osoba osoba;
    WydzialEnum wydzial;

    public Student(String imie) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
        this.pełnoletni = pełnoletni;
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Student() {
    }

    public String getImie() {
        return imie;
    }

    public Student setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Student setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public int getIndeks() {
        return indeks;
    }

    public Student setIndeks(int indeks) {
        this.indeks = indeks;
        return this;
    }

    public boolean isPełnoletni() {
        return pełnoletni;
    }

    public Student setPełnoletni(boolean pełnoletni) {
        this.pełnoletni = pełnoletni;
        return this;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public Student setOsoba(Osoba osoba) {
        this.osoba = osoba;
        return this;
    }

    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public Student setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
        return this;
    }

    @Override
    public String toString() {
        return "imie: " + getOsoba().getImie() + "\nnazwisko: " + getOsoba().getNazwisko() +
                "\nindeks: " + getOsoba().getIndex() + "\nwydział: " + wydzial;
    }
}