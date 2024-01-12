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

        ServerSocket serverSocket = new ServerSocket(20000);
        Socket socket = serverSocket.accept();



                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(),"UTF-8")
                    );

                    String requestMsg = br.readLine();
                    System.out.println("클라이언트한테 받음: " + requestMsg);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

        while (true) {
        Thread t2 = new Thread(() -> {
            try {
                // 키보드에게 입력받는다.
                Scanner sc = new Scanner(System.in);
                String responseMsg = sc.nextLine();

                // 쓰기
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.defaultCharset());
                pw.println(responseMsg);

                // 읽기
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String rr = br.readLine();
                System.out.println(rr);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        }

    }
}
