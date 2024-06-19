package creational.singleton;

import java.io.Serializable;

public class SamosaLazy implements Serializable,Cloneable {
    
    public static SamosaLazy samosaLazy;
    
    private SamosaLazy(){}
    
    public static SamosaLazy getSamosaLazy(){
        synchronized (creational.singleton.SamosaLazy.class) {
                if (samosaLazy == null) {
                    samosaLazy = new SamosaLazy();
                }
                return samosaLazy;
        }
    }

    public Object readResolve(){
        return samosaLazy;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
