import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ReadPalindrome {

    public static List<Palindrome> palindromes = new LinkedList<>();

    public ReadPalindrome(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        while (true) {
            try {
                Palindrome palindrome = (Palindrome) ois.readObject();
                palindromes.add(palindrome);
            } catch (EOFException ex1) {
                break;
            }
        }
        ois.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new ReadPalindrome("palindrome.plr");
        System.out.println(palindromes);
    }
}
