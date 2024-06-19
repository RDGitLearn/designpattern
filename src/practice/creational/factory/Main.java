package practice.creational.factory;

public class Main {
    public static void main(String[] args) {
        Car car = CarFactory.getCar("B");
        car.myCar();

        Car car1 = CarFactory.getCar("R");
        car1.myCar();

    }
}
