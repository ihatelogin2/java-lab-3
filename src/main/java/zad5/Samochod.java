package zad5;

public class Samochod extends Pojazd{
    private String marka;
    private String onomatopeja = "brrrum";

    public Samochod(String gdzieWyprodukowano, int rokProdukcji, int cena) {
        super(gdzieWyprodukowano, rokProdukcji, cena);
    }

    public String getMarka() {
        return marka;
    }

    public Samochod setMarka(String marka) {
        this.marka = marka;
        return this;
    }

    public String getOnomatopeja() {
        return onomatopeja;
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", onomatopeja='" + onomatopeja + '\'' +
                '}';
    }

    public Samochod setOnomatopeja(String onomatopeja) {
        this.onomatopeja = onomatopeja;
        return this;
    }
}
