package creational.builder;

public class Main {
    public static void main(String[] args) {

        User user = new User.UserBuilder().setId("1").setName("Rishu").build();
        System.out.println(user);
    }
}
