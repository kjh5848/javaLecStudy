package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex02 extends JFrame {
    public JLabel label;
    public JPanel panel;
    public JButton button;
    public JTextField textField;

    public ex02() {
        setSize(400,200);
        setTitle("ex02");
        setLayout(new FlowLayout());

        panel = new JPanel();
        textField = new JTextField(15);
        label = new JLabel("카운터 값");
        button = new JButton("증가");

        add(panel);
        add(label);
        add(textField);
        add(button);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex02();
    }

}
