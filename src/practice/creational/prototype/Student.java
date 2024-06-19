package practice.creational.prototype;

import java.io.*;
import java.util.List;

public class Student implements Cloneable,Serializable {

    private String name;
    private int age;
    private List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        System.out.println("Running student constructor.. This is a very time consuming process.");
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subjects=" + subjects +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Student student;
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("creational.prototype.obj"));
            oos.writeObject(this);
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("creational.prototype.obj"));
            student = (Student) ois.readObject();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return student;
    }
}
