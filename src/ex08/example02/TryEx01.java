package ex08.example02;



class Cal2 {
    //
    public void divide(int num) throws RuntimeException{
        System.out.println(10/num);
    }
}

public class TryEx01 {
    public static void main(String[] args) {
        Cal2 cal2 = new Cal2();
        cal2.divide(0);
    }
}
