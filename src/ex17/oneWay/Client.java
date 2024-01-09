package ex17.oneWay;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        // IP, 포트번호가 필요하다. 즉 매개변수 2개나 생성자가 필요
        // 루프백 IP ( localhost = 127.0.0.1 )
        try {
            //Socket socket = new Socket("127.0.0.1",10000);


            Scanner sc = new Scanner(System.in);
            String msg = sc.nextLine();
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(
                            new Socket("127.0.0.1",10000).getOutputStream(),
                            "UTF-8")
            );

            bw.write(msg+"\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

