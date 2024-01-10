package ex17.multi02.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {

        try {
            //1. 소켓과 버퍼 만들기
            Socket socket = new Socket("127.0.0.1", 30000);
            Scanner sc = new Scanner(System.in);
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.defaultCharset());

            // 2. 메시지 전송 스레드
            new Thread(() -> {
                while (true) {
                    String responseMsg = sc.nextLine();
                    pw.println(responseMsg);

                }
            }).start();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}






