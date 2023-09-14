package Project;
public class User {
    private String userName;
    private String userEmail;
    private double userSalary;
    public User(String name, String email, double salary) {
        this.userName = name;
        this.userEmail = email;
        this.userSalary = salary;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        userName = name;
    }

    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String email) {
        userEmail = email;
    }

    public double getUserSalary(){
        return userSalary;
    }

    public void setUserSalary(double salary) {
        userSalary = salary;
    }
}
