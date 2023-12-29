package ex09.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame04 extends JFrame {
    public MyFrame04() {
        setTitle("FlowLayoutTest");
        setSize(600, 150);
        setLayout(new FlowLayout());


        add(new JButton("Button1"));
        add(new JButton("Button4"));
        add(new JButton("Button4"));
        add(new JButton("Button4"));
        add(new JButton("Button4"));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        MyFrame04 f = new MyFrame04();

    }
}
