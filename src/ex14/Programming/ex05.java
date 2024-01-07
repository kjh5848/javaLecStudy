package ex14.Programming;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Color 객체의 리스트를 받아서 컬러 이름 순으로 정렬하고 결과를 리스트로
 * 반환하는 코드를 작성하라. Color 클래스는 다음과 같이 정의된다.
 * 생성자나, 접근자, 설정자는 생략되었다.
 */
class Color {
    String name; //red

    public Color(String name) {
        this.name = name;
    }

    public  String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + name;
    }


}

public class ex05{
    public static void main(String[] args) {
        Color c1 = new Color("Red");
        Color c2 = new Color("Blue");
        Color c3 = new Color("Yollow");
        Color c4 = new Color("Black");

        List<Color> color = new ArrayList<>();
        color.add(c1);
        color.add(c2);
        color.add(c3);
        color.add(c4);


        List<Color> sortedColorList = color.stream()
                .sorted(Comparator.comparing(Color::getName))
                .toList();



        System.out.println(sortedColorList);
    }

}
