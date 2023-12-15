package ex03.Array;

public class TryCatch {
    public static void main(String[] args) {
        int[] array = new int[10];
        try {
            int i = array[10];
        }catch (Exception e) {

            e.printStackTrace();
        }
    }
}
