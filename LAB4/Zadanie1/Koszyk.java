import java.util.Stack;

/**
 * Klasa Koszyk, bazuje na strukrurze stosu, dziedziczy po klasie Stack, LastIn-FirstOut
 * @param <ProduktWkoszyku> Klasa ta operuje na obiektach z klasy ProduktWKoszyku
 */
class Koszyk<ProduktWkoszyku> extends Stack {
    public final int size = 11;
    public Stack koszyk;
    public int top = 0;

    /**
     * Konstruktor klasy Koszyk, tworzy nowy stos-koszyk
     */
    public Koszyk(){
        this.koszyk=new Stack();
    }

    /**
     * Metoda dodająca Obiekt na stos, w przypadku osiągnięcia limitu, infromuje o tym użytkownika
     * @param produkt dodawany obiekt
     */
    public void dodaj(Object produkt){
        if (top == size){
            System.out.println("Koszyk jest pełen!");
        }
        else {
            koszyk.push(produkt);
            this.top ++;
        }
    }

    /**
     * metoda sprawdzająca czy koszyk-stos jest pusty
     * @return  boolean; false - jesli nie jest pusty, true jeśli jest pusty
     */
    @Override
    public boolean isEmpty() {
        if (!(this.koszyk.isEmpty())) {
            return false;
        }
        return true;
    }

    /**
     * metoda wyjmująa obiekt ze stosu, w przypadku wyzerowania stosu, infromuje o tym użytkownika
     */
    public void wyjmij(){
        if (top==0){
            System.out.println("Koszyj jest pusty!");
        }
        else{
            koszyk.pop();
            this.top --;
        }
    }


}
