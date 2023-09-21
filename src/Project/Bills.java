package Project;

import java.util.ArrayList;

public class Bills {
    protected String billName; //Nome da conta (Energia, agua, gas).
    protected double billPrice; //Preço da conta.
    protected ArrayList<Bills> billsList;

    public Bills(String name, double price) {
        this.billName = name;
        this.billPrice = price;
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName;
    }

    public double getBillPrice() {
        return billPrice;
    }

    public void setBillPrice(double billPrice) {
        this.billPrice = billPrice;
    }

    public ArrayList<Bills> getBillsList() {
        return billsList;
    }

    public void setBillsList(ArrayList<Bills> billsList) {
        this.billsList = billsList;
    }

    public static void billsDivision(ArrayList<User> usersList, ArrayList<Bills> billsList) {
        double sumSalary = 0;
        double percentSalary;
        double paymentPart;

        for (User user : usersList) {
            sumSalary += user.getUserSalary();
        }

        for (User user : usersList) {
            percentSalary = user.getUserSalary() / sumSalary;
            user.setUserPercent(percentSalary);
        }

        double sumBills = 0;
        for (Bills bill :
                billsList) {
            sumBills += bill.billPrice;
        }

        for (User user : usersList) {
            paymentPart = sumBills * user.getUserPercent();
            user.setPaymentPart(paymentPart);
        }

        for (User user : usersList) {
            System.out.println("The sum of the bills is: " + sumBills + " euros.");
            System.out.println("The salary sum between is: " + sumSalary + " euros.");
            System.out.println("The salary percent of " + user.getUserName() + " is: " + Math.round(user.getUserPercent() * 100) + "%.");
            System.out.println(user.getUserName() + " will pay the amount of " + Math.round(user.getPaymentPart()) + " euros.");
            System.out.println();
        }
    }
}
