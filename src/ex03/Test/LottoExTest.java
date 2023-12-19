package ex03.Test;

import java.util.Arrays;
import java.util.Random;

public class LottoExTest {
    public static void main(String[] args) {
        int arr[] = new int[6];
        Random r = new Random();

        int num;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                num = r.nextInt(3) + 1;
                arr[i] = num;
            } else {

                while (true) {

                    num = r.nextInt(3) + 1; //
                    //
                    //i가 2이면 2-1 = 1이고 num과 0,1번방의 값이 같지 않으면
                    //2번방에 넣는다. 단, 같으면 정지
                    //i가 3이면 3-1 = 2이고 num과 0,1,2번방의 값이 같지 않으면
                    //3번방에 넣는다.
                    //
                    if (i == 2) { //1 = 0 , 2 = 1 (0이 되게 할려면 -2 감소를 시켜야 한다.) 3
                        if (arr[i-1] != num) { //1 = 0 , 2 = 1 (0이 되게 할려면 -2 감소를 시켜야 한다.) 3
                            arr[i] = num;
                            break;
                        }
                    }
                    if (arr[i-1] != num) { //1 = 0 , 2 = 1 (0이 되게 할려면 -2 감소를 시켜야 한다.) 3
                        arr[i] = num;
                        break;
                    }



                }
            }
        }




        System.out.println(Arrays.toString(arr));




    }
}
