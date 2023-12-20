package ex04;

class cat {
    String name;


    cat() {
        //this.name = "토비";
        this("토비");

    }

    cat(String name) {
        this.name = name;

    }
}

public class HeapEx01 {
    public static void main(String[] args) {
        cat c = new cat("토비");
    }
}
