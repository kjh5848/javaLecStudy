package ex17.multi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) throws IOException {

        ServerSocket serverSocket = new ServerSocket(30000);
        Socket socket = serverSocket.accept();

        Thread t1 = new Thread(() -> {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(socket.getInputStream(),"UTF-8")
                );
                while (true) {
                    String requestMsg = br.readLine();
                    System.out.println("클라이언트한테 받음: " + requestMsg);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            try {
                // 키보드에게 입력받는다.
                Scanner sc = new Scanner(System.in);

                // 쓰기
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.defaultCharset());

                while (true) {
                    String responseMsg = sc.nextLine();
                    pw.println(responseMsg);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();
    }

}
