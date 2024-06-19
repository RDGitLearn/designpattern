package practice.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        //Test Lazysingleton
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(lazySingleton.hashCode());

        LazySingleton lazySingleton1 = LazySingleton.getInstance();
        System.out.println(lazySingleton1.hashCode());

        LazySingleton lazySingleton2 = LazySingleton.getInstance();
        System.out.println(lazySingleton2.hashCode());

        LazySingleton lazySingleton3 = LazySingleton.getInstance();
        System.out.println(lazySingleton3.hashCode());

        System.out.println("--".repeat(30));

         EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        System.out.println(eagerSingleton.hashCode());

        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode());

        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton2.hashCode());

        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton3.hashCode());

        //Cloning
        LazySingleton cloningLazy = (LazySingleton) lazySingleton.clone();
        System.out.println("Cloned Object " + cloningLazy.hashCode());

        //Reflection API
        try {
            Constructor constructor = LazySingleton.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            LazySingleton lazySingleton4 = (LazySingleton) constructor.newInstance();
            System.out.println("Singleton 4 " + lazySingleton4.hashCode());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        // Serializable
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("lazy.obj"));
        oos.writeObject(lazySingleton);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("lazy.obj"));
        LazySingleton serializeLazy = (LazySingleton) ois.readObject();

        System.out.println("Serialized Lazy Object " + serializeLazy.hashCode());
    }


}
