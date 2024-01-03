package ex16;

import javax.swing.*;



public class CarGame extends JFrame {
    class MyThread extends Thread {
        private JLabel label;
        private JPanel panel;
        private int x, y;

        public MyThread(String fname, int x, int y) {
            this.x = x;
            this.y = y;


            label = new JLabel();
            label.setIcon(new ImageIcon(fname));
            label.setBounds(x, y, 100, 100);
            add(label);

        }

        public void run() {
            for (int i = 0; i < 200; i++) {
                x += 10 * Math.random();
                label.setBounds(x, y, 200, 200);
                repaint();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();

                }

            }
        }
    }

    public CarGame() {
        setTitle("CarRace");
        setSize(1000, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        JPanel panel = new JPanel();
        panel.setSize(1000 ,800);
        ImageIcon icon = new ImageIcon("image/배경 (1).jpg");
        JLabel label1 = new JLabel(icon);
        panel.add(label1);

        add(panel);

        (new MyThread("image/람보르기니2.jpg",100,50)).start();
        (new MyThread("image/부가티.jpg",100,100)).start();
        (new MyThread("image/포르쉐타이칸.jpg",100,150)).start();
        setVisible(true);
    }

    public static void main(String[] args) {
        new CarGame();
    }

}
