package ex14;

import java.util.Arrays;
import java.util.List;

/**
 * 스트림은 각 요소에서 정보를 추출하는 데 사용할 수 있다. 단어들의
 * 리스트를 받아서 각 단어의 길이 리스트를 반환하는 코드를 작성해보자.
 */
public class StreamExample02 {
    public static void main(String[] args) {
        List<String> word = Arrays.asList("Java", "Stream", "Library");
        System.out.println("입력데이터: "+word);

        List<Integer> result = word.stream()
                .map(s -> s.length())
                .toList();
        System.out.println("실행결과: "+result);

    }
}
