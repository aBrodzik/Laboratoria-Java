import java.io.*;
import java.net.URL;
import java.util.*;

/**
 * Klasa operująca na plikach csv
 */
public class CSV {

    private String readSeparator;
    private String saveSeparator;
    private String nameRead;
    private String nameSave;
    private ArrayList<String[]> csv;
    private String path;

    /**
     *  Konstruktor
     * @param nameRead nazwa pliki do odczytu
     * @param readSeparator separator pliku do odczytu
     * @param nameSave nazwa pliku do zapisu
     * @param saveSeparator separator pliku do zapisu
     */

    public CSV(String nameRead, String readSeparator, String nameSave, String saveSeparator){
        this.nameRead=nameRead;
        this.readSeparator=readSeparator;
        this.nameSave=nameSave;
        this.saveSeparator=saveSeparator;
        this.csv = new ArrayList<String[]>();
    }

    /**
     * metoda czytająca plik csv i zapisująca go do listy
     * @throws FileNotFoundException
     */
    public void read() throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(nameRead))) {
            while (scanner.hasNextLine()) {
                this.csv.add(scanner.nextLine().split(readSeparator));
            }
        }
    }

    /**
     * metoda zapisująca do pliku ze zmienionym separatorem
     * @throws IOException
     */
    public void save() throws IOException {
        Writer writer = new FileWriter(this.nameSave);
        for (int i=0; i<csv.get(0).length;i++){
            List<String> line = Arrays.asList(csv.get(i));
            String toSave = String.join(this.saveSeparator,line);
            System.out.println(toSave);
            writer.write(toSave);
            writer.write("\n");
        }
        writer.close();
    }

     /**
     * metoda zwracająca wartość z podanego wiersza i kolumny pliku
     * @param row wiersz (od 1, więc trzeba odjąć 1 przy odczycie z listy)
     * @param column kolumna (od 1, więc trzeba odjąć 1 przy odczycie z listy)
     * @return wartość z podanego wiersza i kolumny pliku
     * @throws Exception jeśli podane wartośći są ujemne
     */
    public String getValue(int row, int column) throws Exception {
        if (row*column < 0){ // jedno z nich jest ujemne
            throw new Exception("Row and column value must be positive");
        }
        String[] separated = this.csv.get(row-1);
        return separated[column-1];
    }

    //settery i gettery
        public void setNameSave (String nameSave){
        this.nameSave = nameSave;
    }

        public void setReadSeparator (String readSeparator){
        this.readSeparator = readSeparator;
    }

        public void setSaveSeparator (String saveSeparator){
        this.saveSeparator = saveSeparator;
    }

        public void setNameRead (String nameRead){
        this.nameRead = nameRead;
    }

        public String getNameRead () {
        return nameRead;
    }

        public String getNameSave () {
        return nameSave;
    }

        public String getReadSeparator () {
        return readSeparator;
    }

        public String getSaveSeparator () {
        return saveSeparator;
    }



    /**
     * Metoda equals bazująca tylko na ArrayLiście, do której zapisana jest zawartość pliku csv
     * Zdecyowałem, że będą porównywane tylko zawartości plików, a nie parametry ich obiektowych reprezentacji
     * @param o Obiekt reprezentujący plik csv, do którego porównujemy
     * @return wartość logiczna, równe lub nie
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CSV csv1 = (CSV) o;
        return Objects.equals(csv, csv1.csv);
    }

    /**
     * Metoda toString wypisująca zawartość pliku, a potem zwracająca jego parametry
     * @return parametry obiektu-pliku
     */
    @Override
    public String toString() {
        for (int i=0; i<csv.get(0).length;i++) {
            List<String> line = Arrays.asList(csv.get(i));
            String toSave = String.join(this.saveSeparator, line);
            System.out.println(toSave);
        }
        return ("File path: " + this.path + "\n"+
                "Read separator: " + this.readSeparator +"\n"+
                "Save separator: "+ this.saveSeparator);
    }

    /**
     * Metoda hashCodoe, zwracająca hashCode bazujący na Arrayliśćie, do której zapisana jest zwartość pliku
     * @return
     */
    @Override
    public int hashCode() {
        return Objects.hash(csv);
    }
}
