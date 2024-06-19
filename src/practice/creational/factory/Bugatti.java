package practice.creational.factory;

public class Bugatti implements Car{



    @Override
    public Car myCar() {
        System.out.println("Created Car : "+ this.getClass().getName().toString() );
        return new Bugatti();
    }
}
