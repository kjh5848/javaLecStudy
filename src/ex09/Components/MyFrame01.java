package ex09.Components;

import javax.swing.*;
import java.awt.*;

public class MyFrame01 extends JFrame {

    public MyFrame01() {
        setSize(600, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("MyFrame");

        JPanel panel = new JPanel();
        panel.setBackground(Color.BLUE);
        JPanel panel1 = new JPanel();
        panel.setBackground(Color.yellow);
        JPanel panel2 = new JPanel();
        panel.setBackground(Color.orange);

        JLabel label1 = new JLabel(" 자바 피자에 오신것을 환영합니다." +
                "피자의 종류를 선택하세요");

        panel1.add(label1);

        JButton button = new JButton("콤보피자");
        JButton button1 = new JButton("포테이토 피자");
        JButton button2 = new JButton("불고기 피자");

        panel2.add(button);
        panel2.add(button1);
        panel2.add(button2);

        JLabel label2 = new JLabel("개수");
        JTextField field1 = new JTextField(10);
        panel2.add(label2);
        panel2.add(field1);

        panel.add(panel1);
        panel.add(panel2);
        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame01();
    }
}
