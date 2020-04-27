import java.text.DecimalFormat;
import java.util.*;

/**
 * Program symulujący zakupy
 */
public class Zakupy {

    public static void main(String[] args) {
        //Implementacja nazw i cen produktów
        String[] nazwy = new String[]{"chleb", "jabłko", "bułka", "masło", "wodagaz", "wodangaz", "cukier", "mleko", "makaron", "ryz", "papiertoaletowy"};
        Double[] ceny = new Double[]{1.99, 4.99, 0.99, 20.99, 3.99, 2.99, 4.99, 5.99, 2.99, 4.99, 200.99};

        //Stworzenie listy produktów w sklepie
        ArrayList<ProduktWKoszyku> listaProduktów = new ArrayList<ProduktWKoszyku>();
        for (int i = 0; i < nazwy.length; i++) {
            listaProduktów.add(new ProduktWKoszyku(nazwy[i], ceny[i]));
        }

        //Zadeklarowanie koszyków dla klientów
        Koszyk koszyk1 = new Koszyk();
        Koszyk koszyk2 = new Koszyk();
        Koszyk koszyk3 = new Koszyk();
        Koszyk koszyk4 = new Koszyk();
        Koszyk koszyk5 = new Koszyk();
        Koszyk koszyk6 = new Koszyk();
        Koszyk koszyk7 = new Koszyk();
        Koszyk koszyk8 = new Koszyk();
        Koszyk koszyk9 = new Koszyk();
        Koszyk koszyk10 = new Koszyk();
        Koszyk koszyk11 = new Koszyk();
        Koszyk[] koszyki = new Koszyk[]{koszyk1, koszyk2, koszyk3, koszyk4, koszyk5, koszyk6, koszyk7, koszyk8, koszyk9, koszyk10, koszyk11};

        //Zadeklarowanie identyfikatorów Kientom
        int[] id = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Stworzenie listy klientów
        ArrayList<Klient> listaKlientów = new ArrayList<Klient>();
        for (int i = 0; i < nazwy.length; i++) {
            listaKlientów.add(new Klient(id[i], koszyki[i]));
        }
        //Zakupy, dodawanie produktów do koszyków klientóww
        //Klient1
        listaKlientów.get(0).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(0).koszykKlienta.push(listaProduktów.get(3).setIlosc(3));
        listaKlientów.get(0).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(0).koszykKlienta.push(listaProduktów.get(5).setIlosc(1));
        //Klient2
        listaKlientów.get(1).koszykKlienta.push(listaProduktów.get(2).setIlosc(11));
        listaKlientów.get(1).koszykKlienta.push(listaProduktów.get(3).setIlosc(1));
        listaKlientów.get(1).koszykKlienta.push(listaProduktów.get(4).setIlosc(5));
        listaKlientów.get(1).koszykKlienta.push(listaProduktów.get(5).setIlosc(6));
        //Klient3
        listaKlientów.get(2).koszykKlienta.push(listaProduktów.get(2).setIlosc(2));
        listaKlientów.get(2).koszykKlienta.push(listaProduktów.get(5).setIlosc(3));
        listaKlientów.get(2).koszykKlienta.push(listaProduktów.get(10).setIlosc(2));
        listaKlientów.get(2).koszykKlienta.push(listaProduktów.get(9).setIlosc(1));
        //Klient4
        listaKlientów.get(3).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(3).koszykKlienta.push(listaProduktów.get(1).setIlosc(3));
        listaKlientów.get(3).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(3).koszykKlienta.push(listaProduktów.get(5).setIlosc(1));
        //Klient5
        listaKlientów.get(4).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(4).koszykKlienta.push(listaProduktów.get(3).setIlosc(3));
        listaKlientów.get(4).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(4).koszykKlienta.push(listaProduktów.get(5).setIlosc(1));
        //Klient6
        listaKlientów.get(5).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(5).koszykKlienta.push(listaProduktów.get(3).setIlosc(3));
        listaKlientów.get(5).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(5).koszykKlienta.push(listaProduktów.get(5).setIlosc(1));
        //Klient7
        listaKlientów.get(6).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(6).koszykKlienta.push(listaProduktów.get(3).setIlosc(3));
        listaKlientów.get(6).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(6).koszykKlienta.push(listaProduktów.get(5).setIlosc(12));
        //Klient8
        listaKlientów.get(7).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(7).koszykKlienta.push(listaProduktów.get(3).setIlosc(3));
        listaKlientów.get(7).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(7).koszykKlienta.push(listaProduktów.get(5).setIlosc(5));
        //Klient9
        listaKlientów.get(8).koszykKlienta.push(listaProduktów.get(0).setIlosc(2));
        listaKlientów.get(8).koszykKlienta.push(listaProduktów.get(3).setIlosc(4));
        //Klient10
        listaKlientów.get(9).koszykKlienta.push(listaProduktów.get(4).setIlosc(2));
        listaKlientów.get(9).koszykKlienta.push(listaProduktów.get(5).setIlosc(2));
        //Klient11
        listaKlientów.get(10).koszykKlienta.push(listaProduktów.get(3).setIlosc(22));
        listaKlientów.get(10).koszykKlienta.push(listaProduktów.get(10).setIlosc(33));
        listaKlientów.get(10).koszykKlienta.push(listaProduktów.get(9).setIlosc(24));
        listaKlientów.get(10).koszykKlienta.push(listaProduktów.get(8).setIlosc(12));


        //utworzenie kolejki i ustawienie w niej klientów;
        Queue<Klient> kolejkaDoKasy = new LinkedList<Klient>();
        //"losowe" ustawienie klientów w kolejce
        kolejkaDoKasy.add(listaKlientów.get(2));
        kolejkaDoKasy.add(listaKlientów.get(4));
        kolejkaDoKasy.add(listaKlientów.get(1));
        kolejkaDoKasy.add(listaKlientów.get(0));
        kolejkaDoKasy.add(listaKlientów.get(10));
        kolejkaDoKasy.add(listaKlientów.get(6));
        kolejkaDoKasy.add(listaKlientów.get(5));
        kolejkaDoKasy.add(listaKlientów.get(8));
        kolejkaDoKasy.add(listaKlientów.get(9));
        kolejkaDoKasy.add(listaKlientów.get(3));
        kolejkaDoKasy.add(listaKlientów.get(7));

        // lista która będzie przechowywać wartość zakupów każdego klienta
        ArrayList<Double> wartosciKoszykowKlientow = new ArrayList<>();

        //Reprezentacja kolejki klientów
        System.out.println("Kolejka klientow: " + kolejkaDoKasy);
        System.out.println("");

        //zmienne potrzebne do pętli while
        int currentid = 0;
        int k = 0;
        double suma = 0;

        DecimalFormat df = new DecimalFormat("#.00 PLN");
        double a;


        //obsługa klientów
        while (!(kolejkaDoKasy.isEmpty())) {
            suma = 0;
            System.out.println("Obslugiwany klient: " + kolejkaDoKasy.element().id);
            System.out.println("Produkty zakupione przez kienta: ");
            System.out.println("--------------------------");
            while (kolejkaDoKasy.element().koszykKlienta.isEmpty()) {
                if (!(kolejkaDoKasy.element().koszykKlienta.empty())) {
                    currentid = kolejkaDoKasy.element().id;
                    k = kolejkaDoKasy.element().koszykKlienta.size() - 1;
                    ProduktWKoszyku ile = (ProduktWKoszyku) (listaKlientów.get(currentid).koszykKlienta.get(k));
                    System.out.println(listaKlientów.get(currentid).koszykKlienta.get(k));
                    suma = suma + (ile.cena * ile.ilosc);
                    kolejkaDoKasy.element().koszykKlienta.pop();
                } else {
                    break;
                }
            }
            wartosciKoszykowKlientow.add(suma);
            System.out.println("--------------------------");
            System.out.println("Razem: " + df.format(suma));
            System.out.println("=========================="); // "separator kasowy"
            kolejkaDoKasy.remove();
        }
        System.out.println("Kolejka po obsluzeniu klientow:" + kolejkaDoKasy);
    }
}