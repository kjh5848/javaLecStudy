package ex11;

import javax.swing.*;
import java.awt.*;

public class LoginWindow extends JFrame {

    public <Vector> LoginWindow() {

        setTitle("로그인 윈도우");
        setSize(300, 150);

        JPanel panel = new JPanel();
        add(panel);
        panel.setLayout(new GridLayout(4, 2));


        panel.add(new JLabel("id:    "));
        panel.add(new JTextField(20));
        panel.add(new JLabel("password:    "));
        panel.add(new JPasswordField(20));

        JButton login = new JButton("로그인");
        panel.add(login);

        JButton cancel = new JButton("캔슬");
        panel.add(cancel);



        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }

    public static void main(String[] args) {
        new LoginWindow();
    }
}
