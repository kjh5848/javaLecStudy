package ex14.example01;

import java.time.LocalDateTime;

// Data Transfer Object
class JoinDTO {
    private String username; //sarr
    private String password;
    private String email;


    public JoinDTO(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "JoinDTO{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class Member {
    private int no; // 자동생성
    private String username;
    private String password;
    private String email;
    private LocalDateTime createdAt; // 생성시간(회원가입 시간) 1년동안 가입을 안하면 휴면, 5년이면 삭제


    public Member(int no, JoinDTO joinDTO) {
        this.no = no;
        this.username = joinDTO.getUsername();
        this.password = joinDTO.getPassword();
        this.email = joinDTO.getEmail();
        this.createdAt = LocalDateTime.now();
    }



    public int getNo() {
        return no;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Member{" +
                "no=" + no +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}


public class CopyEx05 {
    public static void main(String[] args) {
        JoinDTO d1 = new JoinDTO("ssar","1234","ssar@nate.com");
        JoinDTO d2 = new JoinDTO("cos","1234","cos@nate.com");



//      LocalDateTime now2 = now.plusDays(1);
//      now.plusDays(1);


       Member m2 = new Member(2, d2);
       Member m1 = new Member(2, d2);

        System.out.println(m1);
        System.out.println(m2);


    }
}
