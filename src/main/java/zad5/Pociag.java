package zad5;

public class Pociag extends Pojazd{
    private int ileOsobPrzewiezie;
    private String onomatopeja ="ciuhciuh";

    @Override
    public String toString() {
        return "Pociag{" +
                "ileOsobPrzewiezie='" + ileOsobPrzewiezie + '\'' +
                ", onomatopeja='" + onomatopeja + '\'' +
                '}';
    }

    public int getIleOsobPrzewiezie() {
        return ileOsobPrzewiezie;
    }

    public Pociag setIleOsobPrzewiezie(int ileOsobPrzewiezie) {
        this.ileOsobPrzewiezie = ileOsobPrzewiezie;
        return this;
    }

    public String getOnomatopeja() {
        return onomatopeja;
    }

    public Pociag setOnomatopeja(String onomatopeja) {
        this.onomatopeja = onomatopeja;
        return this;
    }

    public Pociag(String gdzieWyprodukowano, int rokProdukcji, int cena, int ileOsobPrzewiezie, String onomatopeja) {
        super(gdzieWyprodukowano, rokProdukcji, cena);
        this.ileOsobPrzewiezie = ileOsobPrzewiezie;
        this.onomatopeja = onomatopeja;
    }

    public Pociag(String gdzieWyprodukowano, int rokProdukcji, int cena) {
        super(gdzieWyprodukowano, rokProdukcji, cena);
    }
}
