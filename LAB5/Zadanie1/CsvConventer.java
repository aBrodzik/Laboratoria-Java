import java.io.IOException;

public class CsvConventer {

    /**
     * program konwertujący plik csv
     * @param args nazwa pliku odczytywanego, separator odczytywanego, nazwa plik do zapisu u, separator do zapisu
     * @throws IOException
     */
    public static void main(String[] args) throws Exception {

        if (args.length<3){
            throw new Exception("Arguments not given");
        }

        CSV plik = new CSV(args[0],args[1],args[2],args[3]);
        plik.read();
        plik.save();
        System.out.println(plik);
    }
}
