import java.util.Objects;


public class Cewki {
/*
* Klasa zarządzająca informacjami o cewkach
*/

    static class Cewka {
        /*
         * @param zwoje   ilość zwoji cewki
         * @param materiał   materiał z którego wykonana jest cewka
         * @param działa     wartość określająca czy cewka działa
         */
        private int zwoje;
        private String materiał;
        private boolean działa;


        public Cewka(int zwoje, String materiał, boolean działa){
            /*
            * @param zwoje   ilość zwoji cewki
            * @param materiał   materiał z którego wykonana jest cewka
            * @param działa     wartość określająca czy cewka działa
            */

            this.zwoje=zwoje;
            this.materiał=materiał;
            this.działa=działa;
        }
        public String toString(){
            /*
             * @return Stringowa postać obiektu
             */
            return ("Ilość zwoji: " + this.zwoje + '\n' + "Materiał: " + this.materiał+ '\n' + "Działa? " + this.działa);
        }
        //settery i gettery
        public void setMateriał(String NowyMateriał){
            /*
             * Metoda ustawiająca nową wartość materiału
             */
            this.materiał=NowyMateriał;
        }
        public String getMateriał(){
            /*
             * @return materiał
             */
            return materiał;
        }
        public void setZwoje(int NowyZwoje){
            /*
             * Metoda ustawiająca nową wartość Zwoju
             */
            this.zwoje=NowyZwoje;
        }
        public int getZwoje(){
            /*
             * @return zwoje
             */
            return zwoje;
        }
        public void setDziała(boolean NowyDziała){
            /*
             * Metoda ustawiająca nową wartość działa
             */
            this.działa=NowyDziała;
        }
        public boolean getDziała(){
            /*
             * @return działą
             */
            return działa;
        }

        @Override
        public boolean equals(Object o) {
            /*
             * equals wygenerowany pzez środowisko Intellij IDEA
             * @return wartość boolean określającą równość dwóch obiektów
             */
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cewka cewka = (Cewka) o;
            return zwoje == cewka.zwoje &&
                    działa == cewka.działa &&
                    Objects.equals(materiał, cewka.materiał);
        }
        @Override
        public int hashCode() {
            /*
            * hashCode wygenerowany pzez środowisko Intellij IDEA
            * @return hashcode obiektu
             */
            return Objects.hash(zwoje, materiał, działa);
        }
    }


    public static void main(String[] args) {
        //deklaracja pierwszego obiektu
        Cewka c0 = new Cewka(100,"miedź",true);
        System.out.println(c0); //metoda toString

        //sprawdzenie działania metod set i get
        c0.setMateriał("aluminium");
        c0.setDziała(false);
        System.out.println(c0.getMateriał());
        System.out.println(c0.getDziała());
        System.out.println(c0);

        //sprawdzenie działania metod equals i hash
        Cewka c1 = new Cewka(100,"aluminium",false);
        Cewka c2 = new Cewka(100,"miedź",true);
        System.out.println(c0.equals(c1));
        System.out.println(c0.equals(c2));




    }

}



