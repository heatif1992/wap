package entities;


import java.util.HashMap;

public class Userbase {
    private static HashMap<String, User> db = new HashMap<>();

    public static boolean userExists(User user) {
        if (user == null) return false;
        setDB();
        return db.containsValue(user);

    }

    private static void setDB(){
        //add demo data
        User testUser1 = new User("Houssam","1992");
        User testUser2 = new User("atif","1234");
        User testUser3 = new User("user1","000");
        User testUser4 = new User("user2","111");

        db.put("1",testUser1);
        db.put("2",testUser2);
        db.put("3",testUser3);
        db.put("4",testUser4);
    }
}
