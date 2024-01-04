package ex13.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(i);
        }
        System.out.println("큐의 요소: " + q);

        int e = q.remove();
        int e1 = q.remove();
        int e2 = q.remove();

        System.out.println("삭제된 요소: " + e);
        System.out.println("삭제된 요소: " + e1);
        System.out.println("삭제된 요소: " + e2);

        System.out.println(q);
    }

}
