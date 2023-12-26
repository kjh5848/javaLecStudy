package ex06.example5;

public class Dark extends Protoss {
    String name;

    public Dark(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println("다크가 공격합니다: " + name);
    }

}
