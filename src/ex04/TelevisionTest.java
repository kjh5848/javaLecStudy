package ex04;


class Television1{

    private int channel;
    private int volume;
    private boolean onOff;

    Television1(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }

    void print() {
        System.out.println("채널은" + channel + "이고 불륨은"+ volume +"입니다.");
    }
}

public class TelevisionTest {
    public static void main(String[] args) {
        Television1 tv = new Television1(7,10,true);
        tv.print();

        Television1 yourTv = new Television1(11,20,true);
        yourTv.print();
    }
}
