package ex03;

/**
 * 2~9단까지 출력되는 프로그램을 만드시오
 * 스캐너를 이용하여 입력받은 단만 출력하시오
 */
public class GugudanEx02 {
    public static void main(String[] args) {
        int y = 0;

        for (int i = 2; i < 10; i++) {

            for (int j = 2; j <= 9; j++) {
                //y += j; // y = y + j
                System.out.print(i + "단은 " + (i * j) + "입니다.\n");

            }
            System.out.println("\t");
        }

    }
}
