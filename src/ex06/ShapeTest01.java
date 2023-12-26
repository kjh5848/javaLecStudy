package ex06;

class Shape02 {
    public void draw() {
        System.out.println("Shape중의 하나를 그릴예정입니다.");
    }


    class Circle02 extends Shape02 {
        public void draw() {
            super.draw();
            System.out.println("Circle을 그립니다.");
        }
    }
}


//class Rectangle extends Shape02 {
//
//    public void draw(){
//        System.out.println("Rectangle 그립니다.");
//    }
//}
//class Triangle extends Shape02 {
//
//    public void draw(){
//        System.out.println("Triangle 그립니다.");
//    }
//}
public class ShapeTest01 {
    public static void main(String[] args) {

       //Circle01 s = new Circle01();
       Shape02.Circle02 c = new Shape02().new Circle02();

        c.draw();
    }
}
