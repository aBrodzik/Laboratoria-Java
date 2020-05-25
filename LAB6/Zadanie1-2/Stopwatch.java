
import java.text.DecimalFormat;
import java.util.logging.Level;
import java.util.logging.Logger;

import static java.lang.Math.random;


/**
 *
 * Klasa będąca wątkiem zegara
 *
 */
public class Stopwatch extends Thread {

    static public int sekundy, minuty;
    static public boolean stop;
    static private boolean wasRunned = true;

    /**
     * konstrukor zegara, pozwala na uruchomienie tylko jednego wątku
     */
    public Stopwatch() {
        if (wasRunned) {
            stop = false;
            this.start();
            wasRunned = false;
        }
        stop = false;
    }

    @Override
    public void run() {
        while (true) {

            if (stop) {

            } else {
                int randomSleep = (int) (Math.random() * (1500 - 500 + 1) + 500);
                try {
                    this.sleep(randomSleep);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Zadanie1.time = Zadanie1.time + randomSleep;


            }
            Zadanie1.sumTime.setText("Sumaryczy przespany czas: " + Zadanie1.time + "");

        }
    }
}