package ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class CheckBoxTest extends JFrame {
    public CheckBoxTest() {

        setTitle("CheckBox Test");
        setLayout(new GridLayout(0, 1));
        JLabel label1 = new JLabel();
        JCheckBox checkBox1 = new JCheckBox("피자");
        JCheckBox checkBox2 = new JCheckBox("스파게티");
        add(checkBox1);
        add(checkBox2);
        add(label1);
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label1.setText("피자가" + (e.getStateChange() ==
                        1 ? "선택되었습니다." : "선택해제되었습니다"));

            }
        });
        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                label1.setText("스파게티가" + (e.getStateChange() ==
                        1 ? "선택되었습니다." : "선택해제되었습니다"));
            }
        });
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new CheckBoxTest();
    }
}
