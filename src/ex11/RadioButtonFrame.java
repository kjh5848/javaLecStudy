package ex11;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame{
    private JRadioButton small, medium, large;
    private JLabel text;
    private JPanel topPanel, sizePanel, resultPanel;

    public RadioButtonFrame() {
        setTitle("라디오 버튼");
        setSize(500,350);

        topPanel = new JPanel();
        topPanel.add(new JLabel("어떤크기의 커피를 주문하시겠습니까?"));
        add(topPanel, BorderLayout.NORTH);

        sizePanel = new JPanel();
        small = new JRadioButton("스몰 사이즈");
        medium = new JRadioButton("미디엄 사이즈");
        large = new JRadioButton("라지 사이즈");

        ButtonGroup size = new ButtonGroup();
        size.add(small);
        size.add(medium);
        size.add(large);



        sizePanel.add(small);
        sizePanel.add(medium);
        sizePanel.add(large);
        add(sizePanel, BorderLayout.CENTER);

        resultPanel = new JPanel();
        text = new JLabel("크기가 선택되지 않았습니다.");
        text.setForeground(Color.red);
        resultPanel.add(text);
        add(resultPanel, BorderLayout.SOUTH);

        Border border = BorderFactory.createTitledBorder("크기");
        sizePanel.setBorder(border);

        Border border1 = BorderFactory.createTitledBorder("질문");
        topPanel.setBorder(border1);

        Border border2 = BorderFactory.createTitledBorder("선택한 메뉴");
        resultPanel.setBorder(border2);

        small.addActionListener(e -> {
            if (e.getSource() == small) {
                text.setText("스몰 크기가 선택되었습니다.");
            }
        });
        medium.addActionListener(e -> {
            if (e.getSource() == medium) {
                text.setText("미디움 크기가 선택되었습니다.");
            }
        });
        large.addActionListener(e -> {
            if (e.getSource() == large) {
                text.setText("라지 크기가 선택되었습니다.");
            }
        });


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }


    public static void main(String[] args) {
        new RadioButtonFrame();
    }

}
