package ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame {
    private JLabel imageLabel;

    public Test() {
        setTitle("JComboBox 예제");
        setSize(400, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 데이터를 저장할 배열 생성
        String[] imageNames = {"dog", "cat", "bird"};

        JComboBox<String> imageList = new JComboBox<>(imageNames);
        imageList.setSelectedItem(0);

        imageList.addActionListener(e-> {
            String imageName = (String) imageList.getSelectedItem();
            updateImage(imageName);
        });

        imageLabel = new JLabel();
        updateImage(imageNames[0]);

        add(imageList, BorderLayout.NORTH);
        add(imageLabel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void updateImage(String imageName) {
        ImageIcon imageIcon = new ImageIcon("images/" + imageName + ".png");
        imageLabel.setIcon(imageIcon);
    }

    public static void main(String[] args) {
        new ComboBoxFrame();
    }
}
