package practice.creational.factory;

public class CarFactory {

    public static Car getCar(String name){
        if("B".equalsIgnoreCase(name)){
            return new Bugatti();
        } else if ("R".equalsIgnoreCase(name)) {
            return new RollsRoyce();
        }
        return null;
    }
}
