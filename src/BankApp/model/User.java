package BankApp.model;

public class User {
    private final int id;
    private String name;
    private int email;




    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email=" + email +
                '}';
    }

    public User(int id, String name, int email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }
}
