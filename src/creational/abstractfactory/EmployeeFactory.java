package creational.abstractfactory;

public class EmployeeFactory {

//    public static Employee getEmployee(String empType){
//        if(empType.trim().equalsIgnoreCase("DEV")){
//            return new Deleloper();
//        }else if(empType.trim().equalsIgnoreCase("MAN")){
//            return new Manager();
//        }
//        return null;
//    }

    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}
