package Project;
public class User {
    private String userName;
    private String userEmail;
    private double userSalary;
    private double userPercent = 0;
    private double paymentPart = 0;
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

    public double getUserPercent() {
        return userPercent;
    }
    public void setUserPercent(double percent) {
        userPercent = percent;
    }

    public double getPaymentPart() {
        return paymentPart;
    }
    public void setPaymentPart(double payment) {
        paymentPart = payment;
    }
}
