package practice.creational.builder;

public class User {
    private String name;
    private int age;
    private String aadhar;

    public User(Builder builder){
        this.name=builder.name;
        this.age=builder.age;
        this.aadhar=builder.aadhar;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAadhar() {
        return aadhar;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", aadhar='" + aadhar + '\'' +
                '}';
    }

    public static class Builder{
        private String name;
        private int age;
        private String aadhar;

        public Builder(String aadhar) {
            this.aadhar = aadhar;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAadhar(String aadhar) {
            this.aadhar = aadhar;
            return this;
        }

        public User build(){
            return new User(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
