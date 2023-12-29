package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex05 extends JFrame {
    public ex05() {
        setSize(400, 150);
        setTitle("ex05");


        JPanel p1 = new JPanel();
        add(p1);

        JLabel l1 = new JLabel("나의 BMI 지수는 얼마나 될까요?");
        p1.add(l1);

        JPanel p2 = new JPanel();
        add(p2);
        p2.add(new JLabel("나의 체중(kg):  "));
        p2.add(new JTextField(20));

        JPanel p5 = new JPanel();
        add(p5);
        p5.add(new JLabel("나의 키(cm):  "));
        p5.add(new JTextField(20));

        JPanel p3 = new JPanel();
        add(p3);

        JButton b1 = new JButton("BMI 지수 확인");
        p3.add(b1);

        JPanel p4 = new JPanel();
        add(p4);
        p4.add(p1);
        p4.add(p2);
        p4.add(p5);
        p4.add(p3);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex05();

    }
}
