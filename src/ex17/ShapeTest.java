package ex17;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class ShapeTest {
    public static void main(String[] args) {
        String hostname = "www.naver.com";

        try {
            InetAddress address = InetAddress.getByName(hostname);
            System.out.println("IP주소: " + address.getHostAddress());

        } catch (UnknownHostException e) {
            System.out.println(hostname+"의 IP주소를 찾을 수 없습니다.");;
        }
    }
}
