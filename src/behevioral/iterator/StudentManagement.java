package behevioral.iterator;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentManagement {
    private LinkedList<Student> students= new LinkedList<>();

    public StudentManagement() {
        students.add(new Student("name1","1"));
        students.add(new Student("name2","2"));
        students.add(new Student("name3","3"));
        students.add(new Student("name4","4"));
        students.add(new Student("name5","5"));
    }

    public MyIterator iterator(){
        return new MyIteratorImpl(students);
    }
}
