/**
 * Klasa przechowywująca informacje o produktach w sklepie
 */
public class Produkt {
    public String nazwa;
    public double cena;

    /**
     * Konstruktor klasy Produkt
     * @param nazwa nazwa produktu
     * @param cena cena produktu
     */
    public Produkt(String nazwa,double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public Produkt() {
    }

    /**
     * metoda set
     * @param nazwa
     */
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    /**
     * metoda set
     * @param cena
     */
    public void setCena(double cena) {
        this.cena = cena;
    }

    /**
     * metoda get
     * @return cena produktu
     */
    public double getCena() {
        return cena;
    }

    /**
     * metoda get
     * @return nazwa produktu
     */
    public String getNazwa() {
        return nazwa;
    }

    /**
     * Metoda toString
     * @return Stringowa reprezentacja obiektu klasy Produkt
     */
    @Override
    public String toString() {
        return "Produkt{" +
                "nazwa='" + nazwa + '\'' +
                ", cena=" + cena +
                '}';
    }
}
