package behevioral.iterator;

import java.util.ArrayList;

public class UserManagement {

    private ArrayList<User> userList= new ArrayList<>();

    public UserManagement() {
        userList.add(new User("name1","1"));
        userList.add(new User("name2","2"));
        userList.add(new User("name3","3"));
        userList.add(new User("name4","4"));
        userList.add(new User("name5","5"));
    }

    public MyIterator iterator(){
        return new MyIteratorImpl(userList);
    }
}
