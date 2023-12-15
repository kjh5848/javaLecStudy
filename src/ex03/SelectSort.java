package ex03;

public class SelectSort {
    static void select(int[] arr) {

        final int N = arr.length;
            for (int i = 0; i < N - 1; i++) {
                int minIndex = i;
                for (int j = i + 1; j < N; j++) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                }
                // 최솟값을 i번째 요소와 교환합니다.
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
    }

    public static void main(String[] args) {
        // 정렬할 배열
        int[] arr = {5, 3, 8, 2, 1};

        // 선택 정렬 수행
        select(arr);

        // 정렬 결과 출력
    //    System.out.print("정렬된 배열: ");
    //    for (int i = 0; i < arr.length; i++) {
    //        System.out.print(arr[i] + " ");
    //    }
    }
}

