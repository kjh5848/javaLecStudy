package bubleGame.ex02;

import javax.swing.*;

public class Player extends JLabel {
    private int x;
    private int y;

    private ImageIcon playerR, playerL;


    public Player() {
        initObjeck();
        initSetting();
    }

    private void initObjeck() {
        playerR = new ImageIcon("image/playeR.png");
        playerL = new ImageIcon("image/playeL.png");

    }

    private void initSetting() {
        x = 55;
        y = 535;

        setIcon(playerR);
        setSize(50, 50);
        setLocation(x, y);

       // this.setIcon(playerL);
    }


}
