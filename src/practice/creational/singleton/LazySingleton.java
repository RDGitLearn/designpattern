package practice.creational.singleton;

import java.io.Serializable;

public class LazySingleton implements Cloneable, Serializable {

    private static LazySingleton lazySingleton;
    private LazySingleton(){ if(lazySingleton!=null){
         throw new RuntimeException("One instance of LazySingleton class already created.");
        }
    }

    public static LazySingleton getInstance(){
       synchronized (LazySingleton.class) {
           if (lazySingleton == null) {
               lazySingleton = new LazySingleton();
           }
       }
        return lazySingleton;
    }

    public Object readResolve(){
        return lazySingleton;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //throw new CloneNotSupportedException("Clone is not supported for the "+ LazySingleton.class.getName());
        return lazySingleton;
    }




}
