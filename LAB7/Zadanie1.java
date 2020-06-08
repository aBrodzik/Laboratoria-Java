/*
Napisz program pobierający listę plików w danym katalogu i obliczający liczbę oraz łączny rozmiar
plików w grupach wg rozszerzenia. Nazwa katalogu jest argumentem wywołania programu.
Należy stworzyć mapę, w której kluczami są rozszerzenia plików, a wartościami obiekty zawierające
liczbę i łączny rozmiar plików o tym rozszerzeniu (należy zaprojektować i zaimplementować odpowiednią
klasę do przechowywania tych danych). Na zakończenie program wypisuje na konsolę informacje
o poszczególnych grupach plików. Funkcjonalność analizowania katalogu/plików należy zawrzeć w klasie,
posiadającej odpowiednie pola i metody, nazwa katalogu dla którego należy wykonać analizę należy
przekazać poprzez konstruktor bądź właściwą metodę typu set....;
program testowy (w funkcji main) tworzy obiekt tej klasy i wykorzystuje jej metody do realizacji zadań.
Uwaga: za rozszerzenie traktuje się ciąg znaków od ostatniej kropki w nazwie pliku
(ale nie nazwie katalogu!) do końca; program powinien być odporny na nazwy plików niezawierające kropki
(rozszerzenie puste - string
Wskazówki: File,
Files.
 */


import java.io.File;
import java.util.*;

public class Zadanie1 {


    static private String getFileExtension(File file) {
        String name = file.getName();
        int lastIndexOf = name.lastIndexOf(".");
        if (lastIndexOf == -1) {
            return ""; // empty extension
        }
        return name.substring(lastIndexOf);
    }

    public static void main(String[] args) {

        String path;

        if (args.length < 1) {
            path = "D:\\Pulpit\\Sycyf\\Lab1";
        } else {
            path = args[0];
        }
        String extension;
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        String key;
        Long[] value = new Long[2];
        Map<String, Long[]> extensions =new TreeMap<>();
        for (File file : listOfFiles){

            key = getFileExtension(file);
            if (!(extensions.containsKey(key))){
                value[0]=file.length()/1000;
                value[1]= Long.valueOf(1);
            }else{
                value=extensions.get(key);
                value[0]=value[0]+file.length()/1000;
                value[1]=value[1]+1;
            }
            extensions.put(key,value);
        }
        System.out.println(extensions);
        for (Map.Entry<String, Long[]> entry : extensions.entrySet()) {
            String k = entry.getKey();
            Long[] v = entry.getValue();

            System.out.printf("%s : %s\n", k, Arrays.toString(v));
        }
        }
        }

