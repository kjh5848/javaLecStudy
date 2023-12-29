package ex09.Programming;

import javax.swing.*;

public class ex03 extends JFrame {
    public ex03() {
        JButton b1 = new JButton("1일");
        JButton b2 = new JButton("2일");
        JButton b3 = new JButton("3일");
        JButton b4 = new JButton("4일");
        JButton b5 = new JButton("5일");

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();

        JLabel l1 = new JLabel("자바 호텔에 오신것을 환영합니다." +
                "숙박일수를 입력하세요");

        p2.add(l1);

        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        p3.add(b4);
        p3.add(b5);

        p1.add(p2);
        p1.add(p3);
        add(p1);

        setSize(400, 150);
        setTitle("ex03");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new ex03();
    }
}
