package banking.application;
import java.util.Scanner;

public class Main {
    private static Bank bank = new Bank();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        repeat();

        boolean flag=true;
        while(flag) {
            System.out.println("Enter your choice:");
            String choice = scan.nextLine();
            switch (choice){
                case "1": addBranch();
                    break;
                case"2" : print();
                    break;
                case "3": addCustomer();
                    break;
                case"4": additionalTransactions();
                    break;
                case "5":  repeat();
                    break;
                case "6": flag =false;
                    break;
                default:
                    System.out.println("Incorrect Value!");
            }

        }
    }

    private static void repeat() {
        System.out.println("MENU......");
        System.out.println("1. To add a new branch of this Bank ");
        System.out.println("2. To print out the customers of a particular branch and its transactions");
        System.out.println("3. To add customers to a particular Branch");
        System.out.println("4. To add additional transactions of a particular customer");
        System.out.println("5. To repeat the menu.");
        System.out.println("6. Quit");
    }

    private static void additionalTransactions() {
        bank.addCustomerTransaction();
    }

    private static void addCustomer() {
        bank.addCustomer();
    }

    private static void print() {
        bank.listCustomers();
    }

    private static void addBranch() {
        bank.addBranch();
    }
}