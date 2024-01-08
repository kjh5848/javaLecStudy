package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        // 보조스트림 만들기
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char[4];

        // 보조스트림 ch으로부터 read한다.
        try {
            ir.read(ch);
            for (char c : ch) {
                System.out.println(c+"");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
