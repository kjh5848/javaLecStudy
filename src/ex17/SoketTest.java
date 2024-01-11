package ex17;

import ex03.Practice.Sum;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Scanner;

public class SoketTest {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("time-c.nist.gov", 13);
            InputStream inputStream = socket.getInputStream();
            Scanner sc = new Scanner(inputStream);

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
