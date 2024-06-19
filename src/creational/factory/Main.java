package creational.factory;

public class Main {
    public static void main(String[] args) {
        Employee dev = EmployeeFactory.getEmployee("DEV");
        System.out.println(dev.getSalary());
        Employee man = EmployeeFactory.getEmployee("MAN");
        System.out.println(man.getSalary());
    }
}
