package ex09.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame06 extends JFrame {
    public MyFrame06() {
        setTitle("GridBagLayout");
        setSize(300, 150);
        setLayout(new GridLayout(2, 3, 12,20));

        add(new JButton("Button1"));
        add(new JButton("Button2"));
        add(new JButton("Button3"));
        add(new JButton("B4"));
        add(new JButton("Long Button5"));



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame06 f = new MyFrame06();

    }
}
