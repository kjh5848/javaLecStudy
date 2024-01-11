package ex17.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class HalfServer {
    public static void main(String[] args) {

        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();

            BufferedReader bw = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = bw.readLine();
            System.out.println("클라이언트로부터 받은 메세지: "+requestMsg);

            // 버퍼 만들기(send)
            PrintWriter pw = new PrintWriter(
                    socket.getOutputStream(),
                    true,
                    Charset.forName("UTF-8"));

            if (requestMsg.equals(1)) {
                pw.println("영화");
            } else if (requestMsg.equals(2)) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
