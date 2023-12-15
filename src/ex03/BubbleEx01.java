package ex03;

/**
 * 5,8,2,4,3(n)
 * 1회전 비교 횟수 = n-1
 * 2회전 비교 횟수 = n-2
 * 3회전 비교 횟수 = n-3
 * 4회전 비교 횟수 = n-4
 *
 * 1 회전 5,8,2,4,3(4바퀴)
 * 1. 5,8 비교(변화x)
 * 2. 8,2 비교(5,2,8,4,3)
 * 3. 8,4 비교(5,2,4,8,3)
 * 4. 8,3 비교(5,2,4,3,8)
 *
 * 2 회전 5,2,4,3,8(3바퀴)
 * 1. 2,5,4,3,8
 * 2. 2,4,5,3,8
 * 3. 2,4,3,5,8
 * 3 회전 2,4,3,5,8(2바퀴)
 *
 * 1. 2,4,3,5,8
 * 2. 2,3,4,5,8
 *
 * 4 회전 2,3,4,5,8(1바퀴)
 *
 * 1. 2,3,4,5,8
 */
public class BubbleEx01 {
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
