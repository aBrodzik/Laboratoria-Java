import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zadanie2 {

        public static void main(String[] args) {
            System.out.println("Podaj nazwę uzytkownika, (q jesli chcesz wyjsc)");
        Map<String, String> pary = new HashMap<>();
        String user,password;
        Scanner scan = new Scanner(System.in);
          while (scan.hasNext()){
              user = scan.next();
              System.out.println(user);
              if (user.equals("q")){
                  System.out.println("Podaj dowolna nazwe wprowadzonego uzytkowika");
                  break;
              }
              System.out.println("Podaj haslo uzytkownika:");
              password=scan.next();
              pary.put(user,password);
              System.out.println("Podaj nazwę uzytkownika, (q jesli chcesz wyjsc)");
          }


          String user1;
          user1 = scan.next();
          if(pary.containsKey(user1)){
              System.out.println("Haslo tego uzytkownika to: " + pary.get(user1));
          }
          else{
              System.out.println("Nie ma takiego uzytkownika");
          }
        }
}
