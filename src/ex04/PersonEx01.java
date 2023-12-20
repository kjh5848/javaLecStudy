package ex04;

class People {
    String name;
    int power;
    int hp;

    //생성자: 객체를 초기화 하는 것
    public People(String name, int power) {
        this.name = name;
        this.power = power;
        this.hp = 100;
    }

    //행위
    public void upgradePower() {
        this.power++;
    }


    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", hp=" + hp +
                '}';
    }


}
public class PersonEx01 {
    public static void main(String[] args) {
        People p1 = new People("주혁",999999);
        System.out.println(p1);

        p1.upgradePower();
        System.out.println(p1);
    }
}
