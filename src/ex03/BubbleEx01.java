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

    static void bubble(int[] arr) {
        final int N = arr.length;

        int y=0;
        int temp;
        for (int loop = 1; loop < N; loop++) { //
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
    public static void main(String[] args) {
        int[] arr = {5,8,2,4,3};
        BubbleEx01.bubble(arr); // 같은 클래스 안에 메소드가 같이 있으면 생략이 가능하다.

        System.out.println("");
        int[] arr2 = {100,200,555,666,777,8,46,5,5,2,2,1,5,44,7,7,7444,44,5,6,2,11};
        bubble(arr2); // 같은 클래스 안에 메소드가 같이 있으면 생략이 가능하다.


    }
}
