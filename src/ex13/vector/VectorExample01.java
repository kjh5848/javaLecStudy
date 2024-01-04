package ex13.vector;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class VectorExample01 {
    public static void main(String[] args) {
        Vector<String> vec = new Vector(); // 타입은 오브젝트
        vec.add("Apple");
        vec.add("Orange");
        vec.add("Mango");

        // 크기
        System.out.println(vec.size());
        System.out.println();

        // 인덱스 접근
        System.out.println(vec.get(1));
        System.out.println();

        // 정렬(오름차순)
        Collections.sort(vec);

        for (String s : vec) {
            System.out.println(s + " ");
        }
        System.out.println();

        // 정렬(내림차순)

        Collections.sort(vec, Collections.reverseOrder());

        for (String s : vec) {
            System.out.println(s + " ");
        }
        System.out.println();

        // 정렬 다른 방법
        // Arrays.sort(); 배열 정렬하는 방법이다.

        // 삭제
        String result = vec.remove(2);
        System.out.println("삭제: "+result);
        System.out.println(vec.size());
        System.out.println();

        // 값 찾기(mango, Mango, MANGO) 여러가지 값이 있을 수도 있다.
        boolean serach = vec.contains("Mango");
        System.out.println(serach);
        System.out.println();


    }
}
