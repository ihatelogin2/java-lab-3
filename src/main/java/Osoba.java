public class Osoba {
    private String imie;
    private String nazwisko;
    private int index;

    public Osoba() {
    }

    public Osoba(String imie, String nazwisko, int index) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.index = index;
    }

    public String getImie() {
        return imie;
    }

    public Osoba setImie(String imie) {
        this.imie = imie;
        return this;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Osoba setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
        return this;
    }

    public int getIndex() {
        return index;
    }

    public Osoba setIndex(int index) {
        this.index = index;
        return this;
    }

    public static void WyswietlOsobe(Osoba osoba){
        System.out.println(osoba.imie+" "+osoba.nazwisko+" "+osoba.index);

    }
    public static String ZwrocDane(Osoba osoba){
        return osoba.getImie()+ osoba.getNazwisko() +osoba.getIndex();
    }
}
