/*
Napisz program obliczający w pętli kolejne przybliżenia wartości ln(x) z szeregu Taylora
(np.: wikipedia),
dla danej wartości x. Na początku program oblicza wartość ln(x) korzystając z funkcji w klasie
java.lang.Math. W każdej iteracji pętli wyliczona wartość przybliżona porównywana jest z wartością
dokładną (uzyskaną z klasy Math) - obliczana jest różnica między tymi wartościami;
program wypisuje odpowiedni komunikat zawierający numer iteracji, wartość przybliżoną i różnicę w stosunku
do wartości dokładnej. Program przerywa obliczenia po uzyskaniu odpowiednio małego błędu (np. 0.001).
Wartość x (dla której trzeba wyznaczyć wartość funkcji) oraz graniczna wartość błędu są argumentami
wywołania programu.
 */


public class Zadanie2 {

    // 1+x^1/1 +x^2/2+X^3/3
    static public double policzSilnie(double x){
        double silnia=1;
        if(x==0){
            return 1;
        }
        else{
            for (int i=1 ;i<=x;i++){
                silnia=silnia*i;
            }
        }
        return silnia;
    }

    public static void main(String[] args) {
    double x,howmuch;
        if(args.length<1) {
            x = 2;
            howmuch=0.0000001;
        }
        else{
            x=Long.parseLong(args[0]);
            howmuch = Double.parseDouble(args[1]);
        }
        int i;
    double calculated = Math.log(x);
        double sub=0;
        double sum=0;
        while (calculated-sub > howmuch){
            i=1;
            if(i%2==0){
                sum= sum - (Math.pow(x-1,i))/i;
            }else{
                sum= sum + (Math.pow(x-1,i))/i;
            }
            sub=Math.abs(calculated-sum);
            System.out.println("n="+i+":"+calculated +"-" +sum+"="+sub);


        }
        Math.log(2);
    }




}
