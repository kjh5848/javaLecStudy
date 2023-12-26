package ex06.example5;

public class Zealot extends Protoss {
    String name;

    public Zealot(String name) {
        this.name = name;
    }


    public void attack() {
        System.out.println("질럿이 공격한다"+name);
    }

}
