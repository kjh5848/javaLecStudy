package ex09;

import javax.swing.*;
import java.awt.*;

public class MyFrame01 extends JFrame {
    public MyFrame01() {
        setSize(400, 400);
        setTitle("MyFrame");

        JButton button = new JButton(" 버튼");
        add(button);
        setLayout(new FlowLayout());

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\G\\Documents\\Lightshot\\icon.png");
        Image icon = imageIcon.getImage();
        setIconImage(icon);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame01 f = new MyFrame01();

    }

}
