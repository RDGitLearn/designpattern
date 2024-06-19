package practice.creational.builder;

public class Main {
    public static void main(String[] args) {
        User user = new User.Builder("Aadhar Number").setAge(10).setName("RD").build();
        System.out.println(user);
    }
}
