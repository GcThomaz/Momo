package Project;

import java.util.ArrayList;

public abstract class Division extends Bills{

    public Division(String name, double price, ArrayList<Bills> billsList) {
        super(name, price, billsList);
    }

    public static void billsDivision(ArrayList<User> usersList, ArrayList<Bills> billsList) {
        double sumSalary = 0;
        double percentSalary = 0;
        double paymentPart = 0;

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
