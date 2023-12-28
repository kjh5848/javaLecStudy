package bubleGame.ex02;

import javax.swing.*;

public class bubleFrame extends JFrame {
    private JLabel backgroundMap;
    private Player player;

    public bubleFrame () {
        initObjeck();
        initSetting();
        setVisible(true);
    }

    private void initObjeck() {
        backgroundMap = new JLabel(new ImageIcon("Image/backgroundMap.png"));
        setContentPane(backgroundMap);

////       backgroundMap.setLocation(300,300);
////       backgroundMap.setSize(100, 100);
//
//        backgroundMap.setSize(1000,600);
//        add(backgroundMap); // 제이프레임에 제이라벨이라는 애가 그려진다.

    }

    private void initSetting() {
        setSize(1000, 640);
        setLayout(null); // 자유롭게 그릴 수 있다
        setLocationRelativeTo(null); //제이프레임을 가운데 위치
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //x버튼으로 종료(JVM 같이 종료)

    }
    public static void main(String[] args) {
        new bubleFrame();
    }
}
