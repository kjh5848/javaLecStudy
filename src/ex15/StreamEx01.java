package ex15;

import Ch02.InputString;
import java.io.IOException;
import java.io.InputStream;


public class StreamEx01 {
    public static void main(String[] args) {
        // 1 바이트씩 받는다
        // 형변환을 해줘야 한다.
        InputStream input = System.in; // System.in 키보드에 연결
        try {
            int value = input.read();
            System.out.println("받은 값: " + (char)value);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
