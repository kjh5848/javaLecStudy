package ex03.Array;

/**
 * 2~9단까지 출력되는 프로그램을 만드시오
 * 스캐너를 이용하여 입력받은 단만 출력하시오
 */
class GugudanUtil {
    static void gugudan(int x) {
        for (int i = 1; i <= 9; i++)
            System.out.println(x + "*" + i + "=" + (x * i));
        System.out.println();
    }
}

public class GugudanEx03 {

        public static void main(String[] args) {
//구구단을 출력하는 메서드
//GugudanUtil.gugudan(10);
//GugudanUtil 클래스에서 gugudan 정적 메서드를 호출
//Parmeter는 int 한개가 필요합니다.

        GugudanUtil.gugudan(10);

 }

}




