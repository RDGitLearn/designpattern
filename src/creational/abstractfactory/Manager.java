package creational.abstractfactory;

public class Manager implements Employee {
    @Override
    public int getSalary() {
        System.out.println("Manager Salary : ");
        return 6000000;
    }
}
