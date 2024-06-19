package practice.creational.abstractfactory;

public class ModernBed extends Bed{
    //@Override
    public Bed myBed() {
        System.out.println("This is my modern Bed.");
        return new ModernBed();
    }
}
