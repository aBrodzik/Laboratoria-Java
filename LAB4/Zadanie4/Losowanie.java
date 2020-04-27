
import java.util.*;

public class Losowanie {

    public static void main(String[] args) {
        int MAX;
        Scanner max = new Scanner(System.in);
        MAX = max.nextInt();
        Random random = new Random();
        List<Integer> wynikilosowania = new ArrayList<>();
        Map<Integer, Integer> parzyste = new TreeMap();
        int randomAbsInt;
        do {
            randomAbsInt= Math.abs(random.nextInt(MAX));
            wynikilosowania.add(randomAbsInt);
            if (parzyste.containsKey(randomAbsInt)) {
                parzyste.put(randomAbsInt, parzyste.get(randomAbsInt)+1);
            }
            else if (randomAbsInt%2==0){
                parzyste.put(randomAbsInt, 1);
            }
        }while (randomAbsInt!=0);

        System.out.println(wynikilosowania);
        if (wynikilosowania.size()>=10){
            System.out.println("5 pierwszych/e w kolejnosci losowania liczb"+wynikilosowania.subList(0,5));
            System.out.println("5 ostatnich/e w kolejnosci losowania liczb" + wynikilosowania.subList(wynikilosowania.size()-6,wynikilosowania.size()));
        }
        else{
            System.out.println(wynikilosowania.size()+ "pierwszych/e w kolejnosci losowania liczb"+wynikilosowania.subList(0,wynikilosowania.size()));
            System.out.println(wynikilosowania.size()+ "ostatnich/e w kolejnosci losowania liczb"+wynikilosowania.subList(0,wynikilosowania.size()));

        }
        for (Map.Entry<Integer, Integer> entry : parzyste.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if (v==1){
                System.out.println("Liczbę : " + k + ", wylosowano " + v +" raz");
            }
            else{
                System.out.println("Liczbę : " + k + ", wylosowano " + v +" razy");
            }
        }
    }
}
