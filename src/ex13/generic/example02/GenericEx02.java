package ex13.generic.example02;

class Box {
    static Object data;
}

public class GenericEx02 {
    public static void main(String[] args) {
        Box.data = "1";
        Box.data = 1;


        System.out.println(Box.data);
    }
}
