package ex09.GUI;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame() {
        setSize(300, 200);
        setTitle("MyFrame");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }

}
