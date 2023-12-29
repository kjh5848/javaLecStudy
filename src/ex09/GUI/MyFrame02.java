package ex09.GUI;

import javax.swing.*;
import java.awt.*;

public class MyFrame02 extends JFrame {
    public MyFrame02() {
        setSize(600, 600);
        setLocation(200,300);
        setTitle("MyFrame");
        getContentPane().setBackground(Color.yellow);

        JButton button1 = new JButton("확인");
        JButton button2 = new JButton("취소");

        this.add(button1);
        this.add(button2);

        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame02 f = new MyFrame02();

    }

}
