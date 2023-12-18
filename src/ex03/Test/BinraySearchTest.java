package ex03.Test;

public class BinraySearchTest {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int N = arr.length;
        final int target = 3;
        int start = 0;
        int end = N - 1;
        int mid;

        int round = 1;
        while (true) {

            mid = start + ((end - start) / 2);
            System.out.println("mid는: " + mid);

            if (arr[mid] == target) {
                System.out.println("target은 " + mid + "에 있습니다.");
                break;
            }
            if (arr[mid] < target) {
                start = mid+1;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            }

            System.out.println(round + "회전"+ start);
            System.out.println(round + "회전" + end);
            round++;

        }
        System.out.println("시간복잡도: "+ (Math.log(N)/Math.log(2)));
}
}
