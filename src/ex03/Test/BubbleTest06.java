package ex03.Test;

public class BubbleTest06 {
    public static void main(String[] args) {

        int[] arr = {5,8,2,4,3};

        final int N = arr.length;

        int y=0;
        int temp;
        for (int loop = 1; loop < 5; loop++) { //
            for (int i = 0; i < N-loop; i++) {
                if(arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i+1] = temp;

                }
            }
        }
        for (int i = 0; i < N; i++) {

            System.out.print(arr[i]+"\t");

        }



    }
}
