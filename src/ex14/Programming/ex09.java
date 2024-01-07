package ex14.Programming;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * 각 음식의 가격이 1000원 이상이고
 * 칼로리가 300이하인 음식만 추출하는 리스트로 만드는 코드
 */
class Food {
    private String name; //음식의 이름
    private int price; // 각 음식의 타입
    private int calories; //각 음식의 칼로리

    public Food(String name, int price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return
                name;
    }
}
public class ex09 {
    public static void main(String[] args) {
        Food f1 = new Food("치킨", 9000, 300);
        Food f2 = new Food("피자", 12000, 350);
        Food f3 = new Food("치즈볼", 500, 100);
        Food f4 = new Food("라면", 3000, 200);

        List<Food> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);

        List<Food> ChooseList = foodList.stream()
                .filter(food -> food.getPrice()>=1000&&food.getCalories()>=300)
                .toList();

        System.out.println(ChooseList);
    }
}
