package ex14.example01;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


    class User1 {
        private String name;
        private int age;

        public User1(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void changeAge() {
            this.age = this.age - 1;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public class StreamEx02 {
        public static void main(String[] args) {
            // User 3명 만들기(홍길동 20, 장보고 15, 임꺽정 30)
            User1 u = new User1("홍길동", 20);
            User1 u1 = new User1("장보고", 15);
            User1 u2 = new User1("임꺽정", 30);
            // ArrayList에 담기
            List<User1> list = Arrays.asList(u, u1, u2);

            // stream으로 순회하면서 map으로 가공하기 (나이 -1)
            List<User1> newList = list.stream()
                    .map(user -> {
                        user.changeAge();
                        return user;
                    }).toList();

            newList.forEach(i -> System.out.println(i.getAge()) );

        }
    }

