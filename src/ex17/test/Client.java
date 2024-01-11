package ex17.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        BufferedReader in = null;
        PrintWriter out = null;
        final Scanner sc = new Scanner(System.in);

        try {
            socket = new Socket("127.0.0.1",20000);
            out = new PrintWriter(
                    socket.getOutputStream(), true
            );

            in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            String msg;
            while (true) {
                System.out.println("서버로 보낼 문자열을 입력하고 엔터키를 치세요");
                msg = sc.nextLine();
                if (msg.equalsIgnoreCase("q")) {
                    out.println(msg);
                    break;
                }
                out.println(msg);
                msg = in.readLine();
                System.out.println("서버로부터 온 메세지: "+ msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
//        }finally {
//            out.close();
//            socket.close();
//            in.close();
//
        }
    }
}
