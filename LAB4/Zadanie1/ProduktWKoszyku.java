import javax.print.attribute.standard.PrinterMessageFromOperator;
import java.text.DecimalFormat;

/**
 * Klasa podrzędna klasy Produkt
 * przechowuje informacje o produktach dodanych do koszyka klienta
 */
class ProduktWKoszyku extends Produkt{
    public int ilosc=0;

    /**
     * Konsturktor klasy ProduktWKoszyku
     * @param nazwa nazwa produktu;
     * @param cena cena produktu'
     */
    public ProduktWKoszyku(String nazwa, double cena){
        this.nazwa= nazwa;
        this.cena=cena;
        this.ilosc=ilosc;
    }

    /**
     * Metoda toString
     * @return Strignowa reprezentacja obiektu
     */
    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00 PLN");
        return (nazwa + " " + df.format(cena) + " x " +  ilosc);
    }

    /**
     * Konstruktor głębokiego klonowania obiektu klasy ProduktWKoszyku
     * @param produktWKoszyku
     */
    public ProduktWKoszyku(ProduktWKoszyku produktWKoszyku){
        this.ilosc = produktWKoszyku.ilosc;
        this.cena=produktWKoszyku.cena;
        this.nazwa=produktWKoszyku.nazwa;
    }

    /**
     * Metoda ustawiająca ilość produktu w koszyku,
     * @param ilosc ilość produktu
     * @return sklonowany obiekt klasy ProduktWkoszyku z zapisaną informacją o jego ilośći
     */
    public Object setIlosc(int ilosc) {
        this.ilosc = ilosc;
        ProduktWKoszyku a = new ProduktWKoszyku(this);
        this.ilosc=0;
        return a;
    }
}

