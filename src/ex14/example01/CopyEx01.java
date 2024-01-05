package ex14.example01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CopyEx01 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 컬렉션 복사
        List<Integer> newList = new ArrayList<>(list);

//        var newList = list.stream().toList();
//        // 스트림 - 흩뿌려진다. 1,2,3,4
//        // map(펑션 인터페이스) - 흩뿌려진 1,2,3,4 순서대로 순회한다.
//        // filter(프리디케이트)

        System.out.println(list.size());
        System.out.println(newList.size());


//        var newList = new ArrayList<>();
//        for (int i = 0; i < list.size(); i++) {
//            newList.add(list.get(i));
//        }
    }

}
