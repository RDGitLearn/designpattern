package practice.creational.prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)  {

        Student student = new Student("TEST", 20, new ArrayList<>(Arrays.asList("Hindi", "Math", "Science")));
        System.out.println(student);
        Student s;
        try {
            s = (Student) student.clone();
            System.out.println(s);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        student.getSubjects().remove(1);
        System.out.println(student);
        System.out.println(s);



    }
}
