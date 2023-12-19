package ex04;

public class CalcuratorApp {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int result =  cal.add(50,80);
        System.out.println(result);

        int minus = cal.minus(50, 80);
        System.out.println(minus);

        double divide = cal.divaide(50, 80);
        System.out.println(divide);

        int multi = cal.multi(50, 80);
        System.out.println(multi);
    }
}
