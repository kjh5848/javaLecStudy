package ex09.Programming;

import javax.swing.*;
import java.awt.*;

public class ex07 extends JFrame {
    public JPanel panel;
    public JTextField textField;
    public JButton[] button;
    public String[] label = new String[20];





    public ex07() {
        setLayout(new GridLayout(4,5,2,2));
        setSize(400, 200);
        setTitle("ex07");
        button = new JButton[20];  // 버튼 배열 초기화

        for (int i = 0; i < 20; i++) {  // 20개의 버튼에 대해
            int R = (int) (Math.random() * 256);
            int G = (int) (Math.random() * 256);
            int B = (int) (Math.random() * 256);
            Color color = new Color(R, G, B);

            button[i] = new JButton(Integer.toString(i+1));  // 버튼 생성, 숫자를 문자열로 변환하여 전달
            button[i].setBackground(color);  // 버튼 색상 설정
            add(button[i]);  // 버튼을 프레임에 추가
        }




            setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ex07();
    }
}
