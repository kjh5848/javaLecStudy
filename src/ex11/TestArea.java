package ex11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestArea extends JFrame implements ActionListener {
    protected JTextField textField;
    protected JTextArea textArea;

    public TestArea() {

        setTitle("Text Area Test");
        textField = new JTextField(30);
        textField.addActionListener(this);

        textArea = new JTextArea(6, 30);
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane, BorderLayout.CENTER);

        //textArea.setEditable(false);

        add(textField, BorderLayout.NORTH);
       // add(textArea, BorderLayout.CENTER);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
        textArea.append(text + "\n");
        textField.selectAll();
        textArea.setCaretPosition(textArea.getDocument().getLength());

    }

    public static void main(String[] args) {
        new TestArea();
    }
}
