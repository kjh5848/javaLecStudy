package ex17.half;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
// 수업한 코드
public class HalfClinet {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost" ,20000);

            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(),
                    true);

            pw.println("3");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream())
            );

            String responseMsg = br.readLine();
            System.out.println("서버로 부터 받은 메세지: " + responseMsg);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
