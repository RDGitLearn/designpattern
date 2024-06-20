package behevioral.iterator;

public class Main {
    public static void main(String[] args) {
        UserManagement um = new UserManagement();
        MyIterator myIterator = um.iterator();
        while (myIterator.hasNext()){
            System.out.println(myIterator.next());
        }

        StudentManagement sm = new StudentManagement();
        myIterator = sm.iterator();
        while (myIterator.hasNext()){
            System.out.println("Student " + myIterator.next());
        }
    }
}
