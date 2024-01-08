package ex15;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class StreamEx04 {
    public static void main(String[] args) {
        BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(System.out)
        );

        try {
            // 다른 컴퓨터가 읽을 때 사용하는 메소드는 readLine()이다.
            // readLine은 \n 까지만 읽기때문에 아래 내용은 readLine을 두개 사용해야한다.
            // write를 보낼때는 \n을 가장 마지막에 붙인다.
            bw.write("안녕\n");
            bw.write("반가워\n");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
