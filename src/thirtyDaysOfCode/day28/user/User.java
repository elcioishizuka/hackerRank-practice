package thirtyDaysOfCode.day28.user;

import java.util.HashSet;
import java.util.Set;

public class User {

    String username;
    String password;
    int age;
    Set<Integer> orderIDs;

    public User(String customUserName, String customPassword, int customAge, Set<Integer> orderIDs) {
        this.username = customUserName;
        this.password = customPassword;
        this.age = customAge;
        this.orderIDs = orderIDs;
    }


    public static void main(String[] args) {

        Set a = new HashSet();
        a.add(56);
        User johndoe = new User("john doe", "anomality", 30 , a);

    }

}
