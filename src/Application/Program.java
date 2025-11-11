package Application;

import Model.Account;

import java.util.Scanner;

public class Program {
    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);


            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = sc.nextDouble();

            Account acc = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

        try {
            acc.withDraw(amount);
            System.out.println("New balance: " + acc.getBalance());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
