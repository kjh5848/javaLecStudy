package ex15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamEx03 {
    public static void main(String[] args) {
        // 버퍼만들기
        InputStreamReader ir = new InputStreamReader(System.in);
        // 타겟인 System.in만 바꾸면 된다.
        BufferedReader br = new BufferedReader(ir);

        try {
            String line = br.readLine();
            System.out.println(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
