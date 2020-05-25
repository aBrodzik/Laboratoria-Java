import javafx.scene.paint.Stop;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Zadanie1 {

    static public int time;
    static JLabel sumTime = new JLabel();
    JFrame frame = new JFrame("Zadanie 1 ");
    JButton start = new JButton("start");
    JButton stop = new JButton("stop");
    JMenuBar bar = new JMenuBar();
    JMenu menu = new JMenu("Menu");
    JMenuItem i1 = new JMenuItem("Uruchom wątek");
    JMenuItem i2 = new JMenuItem("Zatrzymaj wątek");
    JMenuItem i3 = new JMenuItem("O programie");

    /**
     * Konsturkor, tworzy elementy GUI
     */
    public Zadanie1(){
        time=0;
        addMenu();
        addButtons();
        sumTime.setText("Sumaryczy przespany czas: "+time);
        frame.setSize(500,150);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

    }

    /**
     * metoda dodająca przycisk i ustawiająca im ActionListenery
     */
    public void addButtons(){
        frame.add(start);
        frame.add(stop);
        frame.add(sumTime);
        frame.addWindowListener(new WindowAdapter() {
            public void frameClosing(WindowEvent we) {
                System.exit(1);
            }
        });

        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Stopwatch stopwatch = new Stopwatch();

            }
        });


        stop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Stopwatch.stop=true;
            }
        });
    }

    /**
     * metoda dodająca menu i ustawiająca ActionListenery do menuItems pobierajac je z przycisków
     */
    public void addMenu(){

        i1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(ActionListener a: start.getActionListeners()) {
                    a.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null) {
                    });
                }
            }
        });

        i2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                for(ActionListener a: stop.getActionListeners()) {
                    a.actionPerformed(new ActionEvent(this, ActionEvent.ACTION_PERFORMED, null) {
                    });
                }
            }
        });

        i3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane info = new JOptionPane("");
                info.showMessageDialog(null, "Program uruchamia wątek, który losuje czas swojego uśpienia i potem wyświetla sumaryczny czas uśpienia, można go zatrzymać "+"\n"+"Autor:Adam Brodzik");
            }
        });
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        bar.add(menu);
        frame.add(bar);

    }

    public static void main(String[] args) {

        Zadanie1 zadanie = new Zadanie1();

    }
}

