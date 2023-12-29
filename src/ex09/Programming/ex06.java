package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex06 extends JFrame {
    public JPanel p,p1,p2, p3, p4, p5,p6;
    public JLabel l1;
    public JTextField tF1, tF2, tF3, tF4;
    public JFormattedTextField fTF1, fTF2;
    public JPasswordField pa1;
    public JButton b1, b3;

    public ex06() {
        setSize(500, 200);
        setTitle("ex06");



        p1 = new JPanel();
        p1.add(new JLabel("회원 등록하기"));

        p2 = new JPanel();
        p2.add(new JLabel("이름   "));
        p2.add(new JTextField("홍길동"));

        p3 = new JPanel();
        p3.add(new JLabel("패스워드   "));
        p3.add(new JPasswordField("2184"));

        p4 = new JPanel();
        p4.add(new JLabel("이메일주소   "));
        p4.add(new JFormattedTextField("kjh5848@gmail.com"));


        p5 = new JPanel();
        p5.add(new JLabel("전화번호   "));
        p5.add(new JFormattedTextField("010-2705-2184"));

        p6 = new JPanel();
        p6.add(new JButton("등록하기"));
        p6.add(new JButton("취소"));

        p = new JPanel(new GridLayout(0, 1));

        add(p);
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(new JLabel(" "));
        p.add(p4);
        p.add(p5);
        p.add(p6);




        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex06();
    }
}
