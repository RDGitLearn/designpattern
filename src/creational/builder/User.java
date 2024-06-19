package creational.builder;

public class User {
    private final String name;
    private final String id;

    private User(UserBuilder builder){
        this.name = builder.name;
        this.id = builder.id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }

    static class UserBuilder{
        private  String name;
        private  String id;

        public UserBuilder(){

        }
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public User build(){
            User user = new User(this);
            return user;
        }
    }
}
