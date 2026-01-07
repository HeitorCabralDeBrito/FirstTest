package src.application;

import src.entities.Account;
import src.exceptions.BusinessException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");

        System.out.print("Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account acc = new Account(accountNumber, accountHolder, initialBalance, withdrawLimit);

        System.out.println();

        System.out.print("Enter amount for withdraw: ");
        double ammount = sc.nextDouble();

        try {
            acc.withdraw(ammount);
            System.out.printf("New Balance: %.2f%n", acc.getInitialBalance());
        }
        catch (BusinessException e){
            System.out.println(e.getMessage());
        }

        sc.close();

    }

}
