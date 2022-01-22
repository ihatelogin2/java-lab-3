package zad5;

public class Pojazd {
    private String gdzieWyprodukowano;
    private int rokProdukcji;
    private int cena;

    public String getGdzieWyprodukowano() {
        return gdzieWyprodukowano;
    }

    public Pojazd setGdzieWyprodukowano(String gdzieWyprodukowano) {
        this.gdzieWyprodukowano = gdzieWyprodukowano;
        return this;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public Pojazd setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
        return this;
    }

    public int getCena() {
        return cena;
    }

    public Pojazd setCena(int cena) {
        this.cena = cena;
        return this;
    }

    public Pojazd(String gdzieWyprodukowano, int rokProdukcji, int cena) {
        this.gdzieWyprodukowano = gdzieWyprodukowano;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
    }
}
