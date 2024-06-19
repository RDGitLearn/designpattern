package creational.abstractfactory;



public class Main {
    public static void main(String[] args) {
        Employee e = EmployeeFactory.getEmployee(new EmployeeDevFactory());
        System.out.println(e.getSalary());
        Employee e1 = EmployeeFactory.getEmployee(new EmployeeManagerFactory());
        System.out.println(e1.getSalary());


    }
}
