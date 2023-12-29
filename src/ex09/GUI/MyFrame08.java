package ex09.GUI;

import javax.swing.*;

public class MyFrame08 extends JFrame {

    private JButton b1, b2;


    public MyFrame08() {

        setTitle("CradLayoutTest");
        setSize(400, 250);
        setLayout(null);


        b1 =new JButton("Buttom #1");
        add(b1);
        b1.setLocation(50, 30);
        b1.setSize(90, 50);

        b2 =new JButton("Buttom #2");
        add(b2);
        //b2.getBounds(180,30,90,20);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        MyFrame08 f = new MyFrame08();

    }
}
