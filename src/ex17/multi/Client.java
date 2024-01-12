package ex17.multi;

import java.io.*;
import java.net.Socket;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 20000);



        while (true) {
                try {
                    Scanner sc = new Scanner(System.in);
                    String msg = sc.nextLine();


                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.defaultCharset());
                    pw.println(msg);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }





            Thread t2 = new Thread(() -> {
                try {

                    BufferedReader br = new BufferedReader(
                            new InputStreamReader(
                                    socket.getInputStream(),"UTF-8")
                    );

                    String requestMsg = br.readLine();
                    System.out.println("서버로부터 받은 메세지 :" + requestMsg);

                    PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
                    pw.println(requestMsg);

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            });
        }



    }
}
