package ex13.test;

class Model<T> {
    T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}

class User {
    public int id;
    public String title;
    public String aurher;

    public User(int id, String title, String aurher) {
        this.id = id;
        this.title = title;
        this.aurher = aurher;
    }

    public void read() {
        System.out.println(title + "책을 읽습니다.");
    }
}


public class GenericEx01 {
    public static void main(String[] args) {
        Model<User> m = new Model<>();
        m.setData(new User(1, "ai", "김주혁"));

        User u = m.getData();
        u.read();
    }
}
