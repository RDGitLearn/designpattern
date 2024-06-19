package creational.abstractfactory;

public class EmployeeDevFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee() {
        return new Deleloper();
    }
}
