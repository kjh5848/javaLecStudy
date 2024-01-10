package ex17.test.half;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(),
                            "UTF-8")
            );

            String msg = br.readLine();
            System.out.println(msg);

            BufferedWriter bw1 = new BufferedWriter(
                    new OutputStreamWriter(
                            socket.getOutputStream(),
                            "UTF-8")
            );

            bw1.write(msg+"받았어 \n");
            bw1.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
