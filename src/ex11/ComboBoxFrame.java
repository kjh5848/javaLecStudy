package ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxFrame extends JFrame{

//    private JLabel label;
//
//    public ComboBoxFrame() {
//        setTitle("콤보박스");
//        setSize(500, 300);
//
//        String[] animals = {"dog", "cat", "bird"};
//        JComboBox<String> animalList = new JComboBox<>(animals);
//        animalList.setSelectedItem(1);
//
//        animalList.addActionListener(e -> {
//            JComboBox cb = (JComboBox) e.getSource();
//            String name = (String) cb.getSelectedItem();
//            changePicture(name);
//        });
//
//        label = new JLabel();
//        label.setHorizontalAlignment(JLabel.CENTER);
//        changePicture(animals[animalList.getSelectedIndex()]);
//        add(label, BorderLayout.SOUTH);
//
//
//        setVisible(true);
//        setDefaultCloseOperation(EXIT_ON_CLOSE);
//
//    }
//
//
//    protected void changePicture(String name) {
//        ImageIcon icon = new ImageIcon("image/"+name+".png");
//        label.setIcon(icon);
//        if (icon == null) {
//            label.setText("이미지가 발견되지 않았습니다.");
//        } else {
//            label.setText(null);
//
//        }
//
//    }
//
//    public static void main(String[] args) {
//        new ComboBoxFrame();
//    }
}
