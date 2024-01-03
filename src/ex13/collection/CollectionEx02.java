package ex13.collection;

import java.util.ArrayList;
import java.util.List;

public class CollectionEx02 {
    public static void main(String[] args) {
        // Integer 타입의 값을 저장할 수 있는 ArrayList를 생성합니다.
        List<Integer> list = new ArrayList<>();

        // 값 추가
        list.add(1);
        list.add(2);
        list.add(3);

        // 값 출력
        for (int i : list) {
            System.out.println(i);
        }

        // 값 제거
        list.remove(0);  // 인덱스 0의 값을 제거합니다.

        // 값 출력
        for (int i : list) {
            System.out.println(i);
        }
    }
}
