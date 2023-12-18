package ex03.Array;

public class SelectedEx01 {
    public static void main(String[] args) {
        int[] arr = {5, 8, 2, 4, 3};
        final int N = arr.length;
        int rep;
        int min;

        // 변경해야될 위치 -> rep

        // 변겨해야될 위치 -> min
        // 1회전

        for (int i = 0; i < N-1 ; i++) {

            min = i;
            for (int j = i+1; j < N; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            if (i != min) {

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }

        for (int v : arr) {
            System.out.print(v+" ");
        }



    } //end
}
