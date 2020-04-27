import java.util.*;

public class Zbiory {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String pobrane = scan.next().toString();
        if(pobrane.contains("-")){
            System.out.println("Program operauje tylko na nieujemnych zbiorach");
            System.exit(1);
        }
        //pozbycie się zbędnych znaków;
        pobrane = pobrane.replace("[", " ");
        pobrane = pobrane.replace("]", " ");
        pobrane = pobrane.replace("<", " ");
        pobrane = pobrane.replace(">", " ");

        //pozbycie się przecinków, podział inputu na 3 główne części
        String[] parts = pobrane.split(" ");
        String[] part1 = parts[1].split(",");
        String dzialanie = parts[3];
        String[] part3 = parts[5].split(",");

        //stworzenie obiektów typu zbiór, zapobiegnie to występieniu powtórzeń
        Set<String> ZbiorA = new TreeSet<>();
        for (int i = 0; i < part1.length; i++) {
            ZbiorA.add(part1[i]);
        }
        Set<String> ZbiorB = new TreeSet<>();
        for (int i = 0; i < part3.length; i++) {
            ZbiorB.add(part3[i]);
        }
        Set<String> wynik = new TreeSet<>();
        System.out.print(ZbiorA + " " + " " + (dzialanie) + " " + " " + ZbiorB + " " + "= ");
        if (dzialanie.contains("+")) {  //Zwykłe dodawanie dwóch zbiorów
            for (int i = 0; i < ZbiorB.size(); i++) {
                ZbiorA.add(ZbiorB.toArray()[i].toString());
            }
            wynik = ZbiorA;
        }

        //[1,2,3]<->[4,2,6]
        if (dzialanie.contains("-")) {
            for (int i = 0; i < ZbiorA.size(); i++) {
                if (ZbiorA.contains(ZbiorB.toArray()[i].toString())) {  //jeśli odejmowany zbiór zawiera element zbioru od którego odejmujemy, usuń go
                    ZbiorA.remove(ZbiorB.toArray()[i].toString());
                }
            }
            wynik = ZbiorA;
        }
        //[1,2,3]<*>[4,2,6]
        if (dzialanie.contains("*")) {
            for (int i = 0; i < ZbiorA.size(); i++) {
                if (ZbiorA.contains(ZbiorB.toArray()[i].toString())) { //jeśli zbiór A zawiera obiekt ze zbioru B, dodaj go do wyniku
                    wynik.add(ZbiorB.toArray()[i].toString());
                }
            }
        }
        System.out.println(wynik);
    }
}
