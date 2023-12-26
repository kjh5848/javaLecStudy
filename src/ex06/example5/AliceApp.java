package ex06.example5;

//abstract class(추상클래스)는 Object가 아니다.
//new 할 수 없다.
// 상속을 받아야만 쓸 수 있다.
abstract class 판사{
    // public abstract void(추상메서드)
    public abstract void 심문();
}

abstract class 증인 {
    public abstract void 대답();
}


class 왕 extends 판사{
    public void 심문(){
        System.out.println("왕은 심문한다.");
    }
}

class 왕비 extends 판사{
    public void 심문(){
        System.out.println("왕비는 심문한다.");
    }
}

class 모자장수 extends 증인{


    @Override
    public void 대답() {
        System.out.println("모자장수는 대답한다.");
    }
}

class 토끼 extends 증인{
// 알트 + 엔터 하면
    @Override
    public void 대답() {
        System.out.println("토끼는 대답한다.");
    }

}

class 엘리스 extends 증인 {

    @Override
    public void 대답() {

    }
}

public class AliceApp {


    public static void main(String[] args) {
        판사 u1 = new 왕비();// [판사, 왕비]
        증인 u2 = new 토끼();// [증인, 토끼]

        u1.심문();
        u2.대답();
    }
}