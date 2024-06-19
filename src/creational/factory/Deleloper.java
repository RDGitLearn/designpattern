package creational.factory;

public class Deleloper implements Employee{
    @Override
    public int getSalary() {
        System.out.println("Developer Salary : " );
        return 5500000;
    }
}
