import java.util.Objects;

public class Elementy {
    /**
     *
     * Klasa przechowująca informacje o elementachach obwodów elektrycznych
     * posiada dwie klasy podrzędne Cewka i Kondensator
     *
     */

    static class Element {
        public boolean dziala;
        public String jakiprad;
        /**
         * Konstruktor klasy Element
         * @param dziala czy element działa
         * @param jakiprad żargonowo: "wysoki" lub "niski"
         */
        public Element(boolean dziala, String jakiprad){
            System.out.println("Konstruktor klasy nadrzędnej Element wykonał się");
            this.dziala = dziala;
            this.jakiprad = jakiprad;
        }
        /**
         * metoda set
         * @param dziala
         */
        public void setDziala(boolean dziala) {
            this.dziala = dziala;
        }
        /**
         * metoda set
         * @param jakiprad
         */
        public void setJakiprad(String jakiprad) {
            this.jakiprad = jakiprad;
        }
        /**
         * metoda get
         * @return jakiprad
         */
        public String getJakiprad() {
            return jakiprad;
        }
        /**
         * metoda get
         * @return dziala
         */
        public boolean dziala() {
            return dziala;
        }
        /**
         * metoda toString
         * @return stringowa reprezentacja obiektu
         */
        @Override
        public String toString() {
            return "Element{" +
                    "dziala=" + dziala +
                    ", jakiprad='" + jakiprad + '\'' +
                    '}';
        }
        /**
         * metoda equals
         * @param o obiekt do którego porównujemy
         * @return boolean, true jeśli są równe, false jeśli się różnią
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Element element = (Element) o;
            return dziala == element.dziala &&
                    jakiprad.equals(element.jakiprad);
        }
        /**
         * metoda hashCdoe
         * @return haschCode dla obiektu
         */
        @Override
        public int hashCode() {
            return Objects.hash(dziala, jakiprad);
        }
    }

    /**
     * klasa podrzędna klasy Element
     * zmodyfikowana wersja z poprzedniego laboratorium
     * przechowuje informacje o cewkach
     */
    static class Cewka extends Element{
        /**
         *Konsturktor dla klasy Cewka
         * @param dziala dziedziczy od klasy Element
         * @param jakiprad jak wyżej
         * @param zwoje ilość zwoji
         * @param materiał z jakiego materiały wykonana
         */
        public Cewka(boolean dziala, String jakiprad, int zwoje, String materiał){
            super(dziala, jakiprad);
            System.out.println("Konstruktor klasy podrzędnej Cewka wykonał się");
            this.zwoje=zwoje;
            this.materiał=materiał;
        }

        public int zwoje;
        public String materiał;

        /**
         * metoda set
         * @param materiał
         */
        public void setMateriał(String materiał) {
            this.materiał = materiał;
        }
        /**
         * metoda set
         * @param zwoje
         */
        public void setZwoje(int zwoje) {
            this.zwoje = zwoje;
        }
        /**
         * metoda get
         * @return zwoje
         */
        public int getZwoje() {
            return zwoje;
        }
        /**
         * metoda get
         * @return materiał
         */
        public String getMateriał() {
            return materiał;
        }
        /**
         * metoda toString
         * @return stringowa postać obiektu
         */
        @Override
        public String toString() {
            return "Cewka{" +
                    "Dziala=" + dziala +
                    ", Prąd ='" + jakiprad + '\'' +
                    ", Zwoje=" + zwoje +
                    ", Materiał='" + materiał + '\'' +
                    '}';
        }
        /**
         * metoda equals
         * @param o obiekt do którego porównujemy
         * @return boolean, true jeśli są równe, false jeśli się różnią
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Cewka cewka = (Cewka) o;
            return zwoje == cewka.zwoje &&
                    materiał.equals(cewka.materiał);
        }
        /**
         * metoda hashCode
         * @return hashCode dla obiektu
         */
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), zwoje, materiał);
        }
    }

    /**
     * Klasa podrzędna klasy Element
     * przechowuje informacje o kondensatorach
     */
    static class Kondensator extends Element{
        /**
         * Konstruktor dla klasy Element
         * @param dziala dziedziczy po klasie Element
         * @param jakiprad jak wyżej
         * @param pwoierzchnia powierzchnia okładki
         * @param pojemnosc pojemność
         */
        public Kondensator(boolean dziala, String jakiprad, double pwoierzchnia, double pojemnosc){
            super(dziala, jakiprad);
            System.out.println("Konstruktor klasy podrzędnej Cewka wykonał się");
            this.powierzchnia=pwoierzchnia;
            this.pojemnosc=pojemnosc;
        }
        public double powierzchnia;
        public double pojemnosc;

        /**
         * metoda get
         * @return pojemnosc
         */
        public double getPojemnosc() {
            return pojemnosc;
        }
        /**
         * metoda get
         * @return powierzchnia
         */
        public double getPowierzchnia() {
            return powierzchnia;
        }
        /**
         * metoda set
         * @param powierzchnia powierzchnia
         */
        public void setPowierzchnia(double powierzchnia) {
            this.powierzchnia = powierzchnia;
        }
        /**
         * metoda set
         * @param pojemnosc pojemnosc
         */
        public void setPojemnosc(double pojemnosc) {
            this.pojemnosc = pojemnosc;
        }
        /**
         * metoda toString
         * @return stringowa postać obiektu
         */
        @Override
        public String toString() {
            return "Kondensator{" +
                    "dziala=" + dziala +
                    ", jakiprad='" + jakiprad + '\'' +
                    ", powierzchnia=" + powierzchnia +
                    ", pojemnosc=" + pojemnosc +
                    '}';
        }
        /**
         * metoda equals
         * @param o obiekt do którego porównujemy
         * @return boolean, true jeśli są równe, false jeśli się różnią
         */
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            Kondensator that = (Kondensator) o;
            return Double.compare(that.powierzchnia, powierzchnia) == 0 &&
                    Double.compare(that.pojemnosc, pojemnosc) == 0;
        }
        /**
         * metoda hashCode
         * @return hashCode dla obiektu
         */
        @Override
        public int hashCode() {
            return Objects.hash(super.hashCode(), powierzchnia, pojemnosc);
        }
    }


    public static void main(String[] args) {
        /*
        Sprawdzam warunki pierwszego zadania, tworzę 3 obiekty dla 3 klas,
        ustawiam wartości dla wszystkich pól
         */
        Element e0 = new Element(true,"mały");
        Cewka c0 = new Cewka(false,"wysoki",100,"miedź");
        Kondensator t0 = new Kondensator(true,"niski",100,50);
/*
1. Kolejność jest chierarchiczna, na początku wykonywane są konstruktory
w klasie nadrzędnej, a potem w klasie podrzędnej.
2.Jeżeli nie ma domyślnego konsturktora, musimy odnieść się do metody - super, która
pobiera wartości z klasy nadrzędnej
 */

        /*
        sprawdzam warunki dla drugiego zadania, metody toString, equals, dla obiektów
        równych i różnych, haschode
         */
        System.out.println(e0); //metoda toString
        System.out.println(c0);
        System.out.println(t0);

        Element e1 = new Element(true,"mały");
        Element e2 = new Element(false,"mały");
        System.out.println(e0.equals(e1));
        System.out.println(e0.equals(e2));
        System.out.println(e0.hashCode());

        Cewka c1 = new Cewka(false,"wysoki",100,"miedź");
        Cewka c2 = new Cewka(false,"niski",100,"miedź");

        System.out.println(c0.equals(c1));
        System.out.println(c0.equals(c2));
        System.out.println(c0.hashCode());

        Kondensator t1 = new Kondensator(true,"niski",100,50);
        Kondensator t2 = new Kondensator(true,"niski",50,100);

        System.out.println(t0.equals(t1));
        System.out.println(t0.equals(t2));
        System.out.println(t0.hashCode());

        System.out.println(e0.equals(c1));
        System.out.println(t0.equals(c2));

        //zadanie 3
        Element o1 = new Element(true, "wysoki");
        Element o2 = new Cewka(false, "wysoki", 200, "żelazo");
        Element o3 = new Kondensator(true,"niski",13,30);
        System.out.println(o1);
        System.out.println(o3);
        System.out.println(o2);
        /*
        z moich obserwacji mogę stwierdzić, że metody toString wywołują się
        w najbardziej szczegółowym sensie, jeżeli obiekt, do którego odnosimy się
        istnieje w klasie podrzędnej dla innej klasy, a w obu klasach istnieją te same
        metody, wykona się mteoda z klasy podrzędnej
         */
    }
}

