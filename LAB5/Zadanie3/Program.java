import java.io.FileWriter;
import java.util.Properties;
import java.util.Scanner;

public class Program {

    /**
     * Program zapisujący pary(klucz, wartość) do pliku propierties.txt
     * @param args
     * @throws Exception gdy podamy zły typ
     */
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        String klucz,typ,wartość;

            while(true) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj nazwę klusza:");
                klucz = scanner.next();
                System.out.println(klucz);
                if (klucz.equals("q")) {
                    break;
                }
                System.out.println("Podaj typ klusza:");
                typ = scanner.next();

                System.out.println("Podaj wartosc klusza:");
                wartość = scanner.next();

                //string int bollean double
                if (typ.toLowerCase().equals("int")) {
                    int i = Integer.valueOf(wartość).intValue();
                }
                else if (typ.toLowerCase().equals("double")) {
                    double d = Double.valueOf(wartość).doubleValue();
                }
                else if (typ.toLowerCase().equals("boolean")) {
                    boolean b = Boolean.valueOf(wartość).booleanValue();
                }
                else if (typ.toLowerCase().equals("string")) {
                    String str = wartość;
                }
                else{
                    throw new Exception("invalid type");
                }

                properties.put(klucz, wartość);
            }
            properties.store(new FileWriter("properties.txt"),"store to properties file");
    }
}
