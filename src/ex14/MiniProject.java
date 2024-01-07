package ex14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 하나의 상품을 나타내는 Product클래스를 정의하라.
 * 여러가지 상품을 생성하고 ArraysList에 저정한 후에 사용자로부터
 * 조건을 받아서 검색하는 프로그램을 작성해보자.
 * 람다식이나 스트림 API, 메소드 참조를 적극적으로 사용해보자.
 *
 * 출력값
 * 상품을 검색하세요.
 * 상품의 이름:
 * 상품의 가격:
 *
 * 검색된 상품은 HP NoteBook model 100 입니다.
 */

class Product01 {

    private String model;
    private String name;
    private float price;

    public Product01(String model,  String name,float price ) {

        this.model = model;
        this.name = name;
        this.price = price;
    }

    public String getModel() {
        return model;
    }



    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product01{" +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}




public class MiniProject {
    public static void main(String[] args) {
        List<Product01>  list = new ArrayList<>();
        list.add(new Product01( "HP","노트북", 100));
        list.add(new Product01( "HP","노트북2", 150));
        list.add(new Product01( "삼성","TV", 320));
        list.add(new Product01( "엘지","TV", 250));
        list.add(new Product01( "엘지","세탁기", 250));
        list.add(new Product01( "섬성","세탁기", 350));
        list.add(new Product01( "삼성","에어컨", 500));
        list.add(new Product01( "엘지","에어컨", 550));


        Scanner sc = new Scanner(System.in);
        System.out.println("상품을 검색하세요.");
        List<Product01> ItemList = list.stream().toList();
        ItemList.forEach(System.out::println);
        System.out.println("상품의 이름을 검색하세요: ");
        String s1 = sc.nextLine();
        System.out.println("상품의 가격: ");
        int s2 = sc.nextInt();


        Product01 newList =list.stream()
                .filter(product01 -> product01.getName().equals(s1) && product01.getPrice() == s2)
                .findFirst()
                .orElse(null);

        if (newList != null) {
            System.out.println("찾으시는 상품은: " + newList.getModel() + newList.getName() + "입니다.");
        } else {
            System.out.println("찾으시는 상품은 없습니다.");
        }




    }
}
