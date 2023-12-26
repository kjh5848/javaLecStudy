package ex06;

class Shape03 {
    public double getArea() {
        return 0;
    }
    public Shape03() {
        super();
    }
}
class Rectagle extends Shape03 {
    private double width, height;

    public Rectagle(double width, double height) {
        super();
        this.height = height;
        this.width = width;
    }
    public double getArea() {
        return width * height;
    }
}
class Triangle extends Shape03 {
    private double base, height;
    public double getArea() {
        return 0.5 * base * height;
    }
    public Triangle(double base, double height) {
        super();
        this.height = height;
        this.base = base;
    }
}
public class ShapeAreaTest {
    public static void main(String[] args) {
        Shape03 obj1 = new Rectagle(10.0,20.0);
        Shape03 obj2 = new Triangle(10.0, 20.0);

        System.out.println("Rectagle: "+obj1.getArea());
        System.out.println("Triangle: "+obj2.getArea());
        System.out.println();
    }
}
