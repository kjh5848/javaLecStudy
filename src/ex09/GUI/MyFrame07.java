package ex09.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame07 extends JFrame {

    JButton b1, b2, b3;
    Container cPane;
    CardLayout layoutm;

    public MyFrame07() {
        setTitle("CradLayoutTest");
        setSize(300, 150);
        cPane = getContentPane();
        layoutm = new CardLayout();
        setLayout(layoutm);


        JButton b1 =new JButton("Crad #1");
        JButton b2 =new JButton("Crad #2");
        JButton b3 =new JButton("Crad #3");

        add(b1);
        add(b2);
        add(b3);

        b1.addActionListener(e -> layoutm.next(cPane));
        b2.addActionListener(e -> layoutm.next(cPane));
        b3.addActionListener(e -> layoutm.next(cPane));



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame07 f = new MyFrame07();

    }
}
