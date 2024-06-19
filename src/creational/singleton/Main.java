package creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException, CloneNotSupportedException {

        SamosaLazy samosaLazy = SamosaLazy.getSamosaLazy();
        System.out.println(samosaLazy.hashCode());

     /*
        Breaking the creational.singleton design pattern using Reflection API
      */
        Constructor<SamosaLazy> constructor = SamosaLazy.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SamosaLazy samosaLazy1 = constructor.newInstance();
        System.out.println(samosaLazy1.hashCode());
        //--------------------------------

        /*
        Solution to this problem :
        1. Throw an exception from CONSTRUCTOR if anyone try to create one more object
        2. Use Enum
         */

        /*
        Breaking the creational.singleton design pattern using Deserialization
      */

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
        oos.writeObject(samosaLazy);

        System.out.println("Serialization done...");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
        SamosaLazy samosaLazy2 = (SamosaLazy) ois.readObject();
        System.out.println(samosaLazy2.hashCode());
        /* Use readResolve method as below in the serialized class
            public Object readResolve(){
                return samosaLazy;
            }
         */

         /*
        Breaking the creational.singleton design pattern using Clone
      */
        SamosaLazy samosaLazy3 = (SamosaLazy) samosaLazy.clone();
        System.out.println(samosaLazy3.hashCode());
    }
}
