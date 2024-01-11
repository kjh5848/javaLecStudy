package ex17.multi;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;
// 만든거
public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("192.168.0.107", 65000);


        Thread t1 = new Thread(() -> {
            try {
                Scanner sc = new Scanner(System.in);
                PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.defaultCharset());

                while (true) {
                    String msg = sc.nextLine();
                    pw.println(msg);
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();


            Thread t2 = new Thread(() -> {
                try {
                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(socket.getInputStream(),"UTF-8")
                    );
                    while (true) {

                        String requestMsg = br.readLine();
                        System.out.println("서버로부터: " + requestMsg);
                    }

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
            t2.start();
        }

}
