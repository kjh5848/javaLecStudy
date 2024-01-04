package ex16.synchro;

class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
        System.out.println("increment" + count);
    }

    public synchronized void decrement() {
        count--;
        System.out.println("decrement" + count);
    }

    public  int value() {
        return count;
    }
}

public class ex01 {
    public static void main(String[] args) {
        Counter c = new Counter();


        new Thread(c::decrement).start();

        new Thread(c::decrement).start();



        int v = c.value();
        System.out.println("카운트는: " + v);


    }
}
