package ex07.test;
 class Shape1 {
    int x, y;

    // 추상 메소드여도 일반 메소드를 가질 수 있다.
    public void translate(int x, int y) {
        this.x = x;
        this.y = y;

    }

    // 추상 메소드를 하나라도 선언하면 추상 클래스가 된다.
    public  void draw() {};
}

class Rectangle1 extends Shape1 {
    int width, height;
    // 자식 클래스에서 추상 메소드인 draw()를 구현하지 않으면 컴파일 오류가 생긴다.
    public void draw() {

    }
}

class Circle1 extends Shape1 {
    int radius;
    public void draw() {
    }
}

public class AbstractTest {
    public static void main(String[] args) {
        Shape1 s = new Circle1();
        s.draw();
    }
}
