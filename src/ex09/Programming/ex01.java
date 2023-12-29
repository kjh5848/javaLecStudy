package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex01 extends JFrame {
    public JPanel panel;
    public JLabel label;
    public JButton button1, button2;

    public ex01() {
        setSize(300, 150);
        setTitle("ex01");
        panel = new JPanel();
        setLayout(new FlowLayout());


        label = new JLabel();
        button1 = new JButton("yes");
        button2 = new JButton("no");


        add(panel);
        label.setText("자바는 재미있나요?");
        add(label);
        add(button1);
        add(button2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex01();
    }

}
