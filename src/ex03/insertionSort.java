package ex03;

public class insertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 1, 3, 2, 4};
        int N = arr.length;

        int key,temp,i;

        i = arr[1];
        for (int j = 0; j < 4; j++) {
            key = j;
            if (arr[j] > arr[j+1]) {
                arr[j+1] = arr[key];
                key = i;
            }

        }
        for (int j = 0; j < N; j++) {
            System.out.println(arr[i]);
        }


//        if (arr[j+1] > arr[j+2]) {
//            arr[j+2] = arr[j+1];
//
//            if (arr[j] > arr[j+1]) {
//                arr[j+1] = arr[j];
//                key = i;
//            }
//        }

    }
}
