package ex09.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame03 extends JFrame {
    public MyFrame03() {
        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.orange);

        JButton b1 = new JButton("Button1");
        b1.setBackground(Color.yellow);

        JButton b2 = new JButton("Button2");
        b2.setBackground(Color.green);


        panel1.add(b1);
        panel1.add(b2);
        add(panel1);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame03 f = new MyFrame03();

    }
}
