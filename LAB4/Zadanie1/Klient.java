import java.util.Stack;

/**
 * Klasa przechowywująca dane o Klientach sklepu
 */
public class Klient {
    public int id;
    public Stack koszykKlienta;

    /**
     * Konstruktor klasy Klient
     * @param id id klienta
     * @param koszykKlienta Koszyk-stos przypisany Klienta
     */
    public Klient(int id, Koszyk koszykKlienta){
        this.id=id;
        this.koszykKlienta = koszykKlienta;

    }
    /**
     * metoda set
     * @param id klienta
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * metoda get
     * @return id klienta
     */
    public int getId() {
        return id;
    }

    /**
     * metoda toString
     * @return Stringowa reprezentacja obiektu Klient
     */
    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
