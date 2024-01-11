package ex17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket clientSocket = null;
        BufferedReader in = null;
        PrintWriter out = null;

        try {
            serverSocket = new ServerSocket(20000);
            clientSocket = serverSocket.accept();
            Scanner sc = new Scanner(System.in);

            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream())
            );

            out = new PrintWriter(clientSocket.getOutputStream(), true);
            System.out.println("클라이언트와 연결됨");

            while (true) {
                String msg = in.readLine();
                if (msg.equalsIgnoreCase("q")) {
                    System.out.println("클라이언트 연결을 종료하였음");
                    break;
                }
                System.out.println("클라이언트가 보낸 문자: " + msg);
                System.out.println("클라이너트가 보낼 문자열을 입력하고 엔터를 치세요: ");
                String oMsg = sc.nextLine();
                out.println(oMsg);
            }
            out.close();
            clientSocket.close();
            serverSocket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
