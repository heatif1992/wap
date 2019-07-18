package dataaccesslayer;


import models.User;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Userbase {
    private static ArrayList<User> db = new ArrayList<>();

    public static boolean userExists(User user) {
        if (user == null) return false;
        setDB();
        return db.contains(user);
    }

    public static User getUser(String username){
        setDB();
        return db.stream().filter(user -> user.getUsername().equals(username)).collect(Collectors.toList()).get(0);
    }

    private static void setDB(){
        //add demo data
        if(db.size() == 0){
            User testUser1 = new User("houssam","0000","+212 622648654","heatif@mum.edu","1000 N. 4th Street");
            User testUser2 = new User("atif","1111","+212 668541764","atif@mum.edu","1041 N. 4th Street");

            db.add(testUser1);
            db.add(testUser2);
        }

    }
}
