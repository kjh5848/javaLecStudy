package ex13.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionEx04 {
    public static void main(String[] args) {
        // String을 키로, Integer를 값으로 가지는 HashMap을 생성합니다
        Map<String, Integer> map = new HashMap<>();


        // 값 추가
        map.put("사과", 100);
        map.put("바나나", 200);
        map.put("포도", 200);

        // 값 출력
        for (String key : map.keySet()) {
            System.out.println("키: " + key + ",값: " + map.get(key));
        }
        System.out.println();

        // 값 제거
        map.remove("사과");

        // 값 출력
        for (String key : map.keySet()) {
            System.out.println("키: " + key + ",값: " + map.get(key));
        }


    }
}
