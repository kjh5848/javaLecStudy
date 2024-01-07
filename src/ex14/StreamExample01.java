package ex14;

import java.util.Arrays;
import java.util.List;

/**
 * 1부터 8까지를 저장하는 컬렉션을 만들고 이 중에서 짝수만을 골라내어 제곱하는
 * 코드를 스트림 API로 만들어 보자. 람다식을 사용
 */
public class StreamExample01 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        System.out.println("입력데이터: " + list);

        List<Integer> newList = list.stream()
                .filter(n -> n% 2 == 0)
                .map(n -> n * n )
                .toList();

        System.out.println("실행결과: " + newList);
    }
}
