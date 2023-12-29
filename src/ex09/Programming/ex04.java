package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex04 extends JFrame {
    public ex04() {
        setLayout(new GridLayout(2,5,10,10));
        //setLayout(null);


        JLabel l1 = new JLabel("Red");
        JLabel l2 = new JLabel("Yellow");
        JLabel l3 = new JLabel("Green");
        JLabel l4 = new JLabel("Blue");

        JButton b1 = new JButton();
        JButton b2 = new JButton();
        JButton b3 = new JButton();
        JButton b4 = new JButton();

        JPanel p1 = new JPanel();
        //p1.add(l1);
//        p1.add(l2);
//        p1.add(l3);
//        p1.add(l4);

        //add(p1);
        add(l1);
        add(l2);
        add(l3);
        add(l4);

        JPanel p2 = new JPanel();

        add(b1);
        b1.setBounds(50,50,20,20);
        b1.setBackground(Color.red);

        add(b2);
        b2.setBounds(100,150,20,20);
        b2.setBackground(Color.yellow);

        add(b3);
        b3.setBounds(90,50,20,20);
        b3.setBackground(Color.GREEN);

        add(b4);
        b4.setBounds(110,50,20,20);
        b4.setBackground(Color.BLUE);
//
//        p2.add(b1);
//        p2.add(b2);
//        p2.add(b3);
//        p2.add(b4);
//
//        add(p2);




        setSize(300, 150);
        setTitle("ex04");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex04();
    }
}
