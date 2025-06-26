public class User {
    private String name;
    private int userId;

    public User(int userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + ", Name: " + name;
    }
}
