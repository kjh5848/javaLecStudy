package ex06;

class Shape01 {
    public void draw() {
        System.out.println("Shape중의 하나를 그릴예정입니다.");
    }
}

class Circle01 extends Shape01 {
    public void draw(){
       System.out.println("Circle을 그립니다.");
   }
}

class Rectangle01 extends Shape01 {

    public void draw(){
        System.out.println("Rectangle 그립니다.");
    }
}
class Triangle01 extends Shape01 {

    public void draw(){
        System.out.println("Triangle 그립니다.");
    }
}
public class ShapeTest {
    public static void main(String[] args) {

        Rectangle01 s = new Rectangle01();
        s.draw();
    }
}
