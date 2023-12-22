package ex06.Test;
class Base{
    int x,y;

    public Base() {
        x=y=0;
        System.out.println("1");
    }
    public Base(int x,int y) {
        this.x =x;
        this.y =y;
        System.out.println("2");
    }
}

class Derived extends Base {
    public Derived(int x, int y){
        super();
        System.out.println("Dervied() 생성자");

    }

}
public class Test {
    public static void main(String[] args) {
        Derived r = new Derived( 1,2);

    }
}
