package ex13.set;

import java.util.HashSet;

public class FindDuppLication {
    public static void main(String[] args) {
        HashSet<String> s = new HashSet<>();
        String[] sample = {"사과", "사과", "바나나", "토마토"};
        for (String a : sample) {
            if (!s.add(a)) {
                System.out.println("중복된 단어: " + a);
            }

        }
        System.out.println(s.size() + ","+ "중복되지 않는 단어: " + s);
    }
}
