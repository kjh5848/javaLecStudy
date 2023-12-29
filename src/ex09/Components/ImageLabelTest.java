package ex09.Components;

import javax.swing.*;

public class ImageLabelTest extends JFrame {
    private JPanel panel;
    private JLabel label;
    private JButton button;

    public ImageLabelTest() {
        setTitle("레이블 테스트");
        setSize(600, 300);


        panel = new JPanel();
        label = new JLabel("Dog");
        ImageIcon icon = new ImageIcon(("image/Screenshot4.png"));
        label.setIcon(icon);

        button = new JButton("자세한 정보를 보려면 클릭하세요.");
        //add(button, "Souht");
        panel.add(label);
        panel.add(button);
        add(panel);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        ImageLabelTest l = new ImageLabelTest();
    }

}
