package ex17.test.multi;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class MultiServer {
    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {
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
        });

        Thread t2 = new Thread(() -> {
            try {
                ServerSocket serverSocket = new ServerSocket(10000);
                Socket socket = serverSocket.accept();

                InputStream str;
                BufferedWriter bw1 = new BufferedWriter(
                        new OutputStreamWriter(
                                socket.getOutputStream(),
                                String.valueOf(str = System.in)
                ));

                bw1.write(str+"\n");
                bw1.flush();

                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),
                                "UTF-8")
                );

                String msg = br.readLine();
                System.out.println(msg);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        } );
    }
}
