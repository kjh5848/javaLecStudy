package ex17.oneWay;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            // 서버는 소켓을 최소 2개 만든다.
            //ServerSocket serverSocket = new ServerSocket(10000);
            //Socket socket = serverSocket.accept(); //리스너(통신)

            System.out.println("클라이언트 연결됨");
            BufferedReader br = new BufferedReader(
                    new InputStreamReader( new ServerSocket(10000).accept().getInputStream(),"UTF-8")
            );
            while (true) {
                String msg = br.readLine();
                if (msg == null) break;
                System.out.println(msg);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
