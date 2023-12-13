package Ch02;

public class Ex06 {
    public static void main(String[] args) {
        // 드라이브 이름을 만들어보자.

        char c = 'c';
        System.out.println("드라이브 이름: " + c);
        String str = "\\test\\";
        System.out.println("디렉터리 이름: " + str);
        String str2 = "sample";
        System.out.println("파일 이름: " + str2);
        String str3 = "py";
        System.out.println("확장자: " + str3);

        System.out.println();
        System.out.println("완전한 이름은: " + c + ":" + str + str2 + "." + str3);


    }
}
