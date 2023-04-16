public class User {
    private String name;
    private String family;

    private String userName;

    private String password;

    public String getName() {
        return name;
    }

    public User(String name, String family, String userName, String password) {
        this.name = name;
        this.family = family;
        this.userName = userName;
        this.password = password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
