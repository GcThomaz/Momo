package Project;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArrayList<Bills> billsList = new ArrayList<>(); //Array para guardar todas as contas
        ArrayList<User> usersList = new ArrayList<>(); //Array para guardar todos os usuarios
        menu(billsList, usersList);
    }

    static void menu(ArrayList<Bills> billsList, ArrayList<User> usersList) {
        double option = -1;
        while(option != 0) {
            System.out.println("##### MENU #####");
            System.out.println("1. Create user");
            System.out.println("2. Register a fixed bill");
            System.out.println("3. Register a variable bill");
            System.out.println("4. Show de division");
            System.out.println("0. Leave");
            System.out.println("##### #### #####");

            option = askNumber("Type your option: ");

            switch ((int) option) {
                case 1:
                    String userName = askString("Type the user's name: ");
                    String userEmail = askString("Type the user's email: ");
                    double userSalary = askNumber("Type the user's salary: ");
                    createUser(userName, userEmail, userSalary, usersList);
                    break;
                case 2:
                    String fixedBillName = askString("Type the fixed bill name: ");
                    double fixedBillPrice = askNumber("Type the fixed bill price: ");
                    registerFixedBill(fixedBillName, fixedBillPrice, billsList);
                    break;
                case 3:
                    String variableBillName = askString("Type the variable bill name: ");
                    double variableBillPrice = askNumber("Type the variable bill price: ");
                    registerVariableBill(variableBillName, variableBillPrice, billsList);
                    break;
                case 4:
                    Bills.billsDivision(usersList, billsList);
                    break;
                default:
                    System.out.println("Bye!");
                    break;
            }
        }
    }

    static void createUser(String name, String email, double salary, ArrayList<User> usersList) {
        User user = new User(name, email, salary);
        usersList.add(user);
        System.out.println("User created successfully!\n");
    }

    static void registerFixedBill(String name, double price, ArrayList<Bills> billsList) {
        Bills bill = new FixedBills(name, price);
        billsList.add(bill);
        System.out.println("Successfully registered " + name + " bill!\n");
    }

    static void registerVariableBill(String name, double price, ArrayList<Bills> billsList) {
        Bills bills = new VariableBills(name, price);
        billsList.add(bills);
        System.out.println("Successfully registered " + name + " bill!\n");
    }

    static double askNumber(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextDouble();
    }
    static String askString(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
