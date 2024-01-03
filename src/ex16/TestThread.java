package ex16;

class MyRunnable2 implements Runnable {
    String name1;

    public MyRunnable2(String name2) {
        name1 = name2;
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.print(name1 + i+ " ");
        }

    }
}

public class TestThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable2("A"));
        t1.start();

        Thread t2 = new Thread(new MyRunnable2("B"));
        t2.start();

    }
}
