package zad5;

public class Samolot extends Pojazd {
    private int ileOsobPrzewiezie;
    private String onomatopeja = "wziuum";

    public Samolot(String gdzieWyprodukowano, int rokProdukcji, int cena) {
        super(gdzieWyprodukowano, rokProdukcji, cena);
    }



    @Override
    public String toString() {
        return "Samolot{" +
                "ileOsobPrzewiezie='" + ileOsobPrzewiezie + '\'' +
                ", onomatopeja='" + onomatopeja + '\'' +
                '}';
    }

    public Samolot(String gdzieWyprodukowano, int rokProdukcji, int cena, int ileOsobPrzewiezie, String onomatopeja) {
        super(gdzieWyprodukowano, rokProdukcji, cena);
        this.ileOsobPrzewiezie = ileOsobPrzewiezie;
        this.onomatopeja = onomatopeja;
    }

    public int getIleOsobPrzewiezie() {
        return ileOsobPrzewiezie;
    }

    public Samolot setIleOsobPrzewiezie(int ileOsobPrzewiezie) {
        this.ileOsobPrzewiezie = ileOsobPrzewiezie;
        return this;
    }

    public String getOnomatopeja() {
        return onomatopeja;
    }

    public Samolot setOnomatopeja(String onomatopeja) {
        this.onomatopeja = onomatopeja;
        return this;
    }

}
