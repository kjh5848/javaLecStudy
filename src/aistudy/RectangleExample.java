package aistudy;


class Rectangle {
    double width;
    double height;


    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }
    public boolean isArea() {
        if (width != height) {
            System.out.println("두변의 길이가 같지 않습니다.");
            return false;
        }
        return true;
    }

    public double getArea() {
        System.out.println("정사각형의 넓이는: ");
        return width * height;
    }
}

class Square extends Rectangle {
    public Square(double sideLenth) {
        super(sideLenth ,sideLenth);
    }
}


public class RectangleExample {
    public static void main(String[] args) {


        Rectangle r = new Square(12);
        System.out.println(r.isArea());
        System.out.println(r.getArea());




    }
}
