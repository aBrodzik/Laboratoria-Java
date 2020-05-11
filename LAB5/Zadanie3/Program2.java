import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Program2 {

    /**
     * Program wczytujący pary(klucz, wartość) z pliku i sprawdzjący, czy podany klucz istnieje, potem wyświetla jego wartość
     * @param args
     * @throws Exception jeśli nie ma podanego klucza
     */
    public static void main(String[] args) throws Exception {
        Properties loadProperties = new Properties();

        try {
            loadProperties.load(new FileInputStream("properties.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwę klusza:");
        String klucz;
        klucz= scanner.next();
        if(loadProperties.containsKey(klucz)){
            System.out.println("Wartość podanego klucza to: "+loadProperties.getProperty(klucz));
        }
        else {
            throw new Exception("Invalid key");
        }
    }
}
