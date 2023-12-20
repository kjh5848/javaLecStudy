package ex04;

import java.awt.event.TextEvent;

public class Television {
    int channel;
    int volume;
    boolean onOff;


    public static void main(String[] args) {
        Television tv = new Television();
        tv.channel = 7;
        tv.onOff = true;
        tv.volume = 10;


        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("나의 텔레비전 채널은" +tv.channel+"이고 불륨은" +tv.volume+"입니다.");
        System.out.println("나의 텔레비전 채널은" +yourTv.channel+"이고 불륨은" +yourTv.volume+"입니다.");
    }
}
