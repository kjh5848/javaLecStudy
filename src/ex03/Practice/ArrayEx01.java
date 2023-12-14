package ex03.Practice;

public class ArrayEx01 {
    public static void main(String[] args) {
        int[] arr = new int[3]; //
        // [] 연속된 공간을 찾는다.
        // int=4byte 3개면 4*3 =12 칸을 찾아서 읽는다.
        // 4번지 부터 찾는 다면 - 4 + 12 = 16-1
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        //arr[3] = 4; // 다음 칸이 없기 때문에 예외처리 Exception가 뜬다.

        for (int i = 0; i <= 2; i++) {
            System.out.println(arr[i]);
        }


    }
}
