package creational.singleton;

public class SamosaEager {

    private SamosaEager(){}
    private static SamosaEager samosaEager = new SamosaEager();

    public static SamosaEager getSamosaEager(){
        return samosaEager;
    }

}
