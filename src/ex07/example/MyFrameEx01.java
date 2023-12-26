package ex07.example;


import javax.swing.*;
import java.awt.*;

class BasicFrame extends JFrame{
    public BasicFrame() {

    }
}

public class MyFrameEx01 {

    static int num = 1;
    static double num1 = 2;

    public static void main(String[] args) {
        JFrame jf = new JFrame();
        //jf.setLayout(new BorderLayout());
        jf.setSize(300, 500);


        JButton btn1 = new JButton("더하기");
        JButton btn2 = new JButton("빼기");
        JButton btn3 = new JButton("2 나누기");

        JLabel la1 = new JLabel(num+"");

        jf.add("North",btn1);
        jf.add("South",btn2);
        jf.add("East",btn3);
        jf.add("Center",la1);


        btn1.addActionListener(e ->{
            num++;
            la1.setText(num + " ");
        });

        btn2.addActionListener(e -> {
            num--;
            if (num <= 0) {
                num= 0;
            }
            la1.setText((num+" "));
        });

        btn3.addActionListener(e -> {
           la1.setText(num/num1+ "");
        });

        jf.setVisible(true);

    }
}
