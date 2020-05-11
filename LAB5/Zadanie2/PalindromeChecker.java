import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Podaj palindrom, (q jesli chcesz wyjsc)");
        Scanner scan = new Scanner(System.in);
        String palindromCandidate;
        while (scan.hasNext()) {
            palindromCandidate = scan.next();
            if (palindromCandidate.equals("q")) {
                break;
            }
            final Palindrome p1 = new Palindrome (palindromCandidate);
        }
    }
}






