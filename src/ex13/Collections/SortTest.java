package ex13.Collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    int number;
    String name;

    public Student(int number, String name) {
        this.number = number;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }

    public int compareTo(Student s) {
        return s.number - number;
    }
}

public class SortTest {
    public static void main(String[] args) {
        Student array[] = {
                new Student(2,"김철수"),
                new Student(3,"이철수"),
                new Student(1,"박철수")
        };

        List<Student> list = Arrays.asList(array);


        // 오름차순
        Collections.sort(list);
        System.out.println(list);

        // 내림차순
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);


    }
}

