package application;

import entities.Account2;

import java.util.Scanner;

public class MainAccount2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Account2 account2;

        System.out.print("Enter account number: ");
        int number = scanner.nextInt();
        System.out.print("Enter account holder: ");
        scanner.nextLine();
        String holder = scanner.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = scanner.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double intialValue = scanner.nextDouble();
            account2 = new Account2(number, holder, intialValue);
        } else {
            account2 = new Account2(number, holder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(account2);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = scanner.nextDouble();
        account2.deposit(amount);

        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(account2);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        amount = scanner.nextDouble();
        account2.withdraw(amount);

        System.out.println();
        System.out.println("Update account data: ");
        System.out.println(account2);


        scanner.close();
    }
}
