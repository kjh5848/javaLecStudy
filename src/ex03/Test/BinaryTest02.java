package ex03.Test;

public class BinaryTest02 {
    public static void main(String[] args) {


        //start=0 ~ end = 8
        // mid = N/2 = 4 -> arr[4] -> 값 5
        // if(8==5) -> mid 위치에 타겟이 있다.
        // if(8>5) 참


        // start=5 (mid+1) ~ end=8
        // mid = 7 = arr[7] -> 값 8
        // if(8==8) -> mid 위치에 타겟이 있다.
        // if(8>8)



        // 이진 검색 => 반드시 정렬이 되어 있어야 한다.
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 9 / 2 = 4

        int N = arr.length;

        final int target = 3;
        int start = 0;
        int end = N - 1;
        int mid;
        int count=0;
        for (int i = 1; i <N-1 ; i++) {
        mid =start+ ((end - start) / 2);


            if (arr[mid] == target) { //5 == 8
                System.out.println(target + "값은 " + mid + "번지에 있습니다");
                break;
            }

            if (arr[mid] < target) { // 기대값 start 5, end 8
                start = mid + 1; // start = 6

            }

            if (arr[mid] > target) { // 기대값 start 0, end 3
                end = mid - 1; // end = 4
            }
            count++;
            System.out.println(i+"회전은: " + start);
            System.out.println(i+"회전은: " + end);
            System.out.println(count+"번 검색 했습니다.");
        }

//        // 2회전
//        mid = start+ ((end - start) / 2); // 5 + ((9-5)/2) = 인덱스 7(8)
//
//        if (arr[mid] == target) { //mid = 7 , target =8
//            System.out.println(mid + " 번지에 있습니다.");
//        }
//
//        if (arr[mid] < target) {
//            start = mid +1;
//        }
//
//        if (arr[mid] > target) {
//            end = mid -1;
//        }
//
//        System.out.println("2회전은: "+ start);
//        System.out.println("2회전은: "+ end);
//
//        // 3회전
//        mid = start+ ((end - start) / 2); // 5 + ((9-5)/2) = 인덱스 7(8)
//
//        if (arr[mid] == target) { //mid = 7 , target =8
//            System.out.println(mid + " 번지에 있습니다.");
//        }
//
//        if (arr[mid] < target) {
//            start = mid +1;
//        }
//
//        if (arr[mid] > target) {
//            end = mid -1;
//        }
//
//        System.out.println("3회전은: "+ start);
//        System.out.println("3회전은: "+ end);
    }
}
