package Day2;


import java.util.Scanner;

import java.lang.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        double amou = 0;

        double overDraft = 0;



        Account myAccount=null;


        System.out.print("Enter your ID :");
        int userId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Name :");
        String name = scanner.nextLine();

        System.out.println("Which account want to use ? (1) Current Account or (2) Saving Account :");
        int accNum = scanner.nextInt();

        if (accNum == 1) {

            System.out.println("Enter Overdraft Limit for current account :");
            overDraft = scanner.nextDouble();

            myAccount = new CurrentAccount(userId, name, amou, overDraft);

            System.out.println("Your are choosing Current Account.");

        } else if (accNum == 2) {


            myAccount = new SavingAccount(userId, name, amou, 0.02);

            System.out.println("Your are choosing Saving Account.");

        } else {

            System.out.println("Invalid Input.Defaulting Saving Account.");

            myAccount= new SavingAccount(userId, name, amou, 0.02);


        }


        while (flag) {

            System.out.print("Deposit(D) or Withdraw(W) or View Transaction History(T)or Adding Interest(I) or" +
                    " View Account Details(V) or Delete Account(L) or Exit(E) : ");
            char ch = scanner.next().charAt(0);


            if (String.valueOf(ch).equalsIgnoreCase("D")) {


                System.out.print("Enter Deposit Amount :");

                amou = scanner.nextDouble();
                myAccount.Deposit(amou);


            } else if (String.valueOf(ch).equalsIgnoreCase("W")) {

                System.out.print("Enter Withdraw Amount :");

                amou = scanner.nextDouble();

                myAccount.Withdraw(amou);


            } else if (String.valueOf(ch).equalsIgnoreCase("T")) {


                System.out.print("View Transaction History :");


                myAccount.TransactionHistory();

            } else if (String.valueOf(ch).equalsIgnoreCase("V")) {

                System.out.println("Enter your account details :");

                myAccount.viewAccountDetails();


            } else if (String.valueOf(ch).equalsIgnoreCase("L")) {

                System.out.println("Enter Id  for delete :");

                myAccount.delete();


            } else if (String.valueOf(ch).equalsIgnoreCase("E")) {

                System.out.println("Program Exit.");

                flag = false;


            } else if (String.valueOf(ch).equalsIgnoreCase("I")) {

                System.out.println("View Interest :");

                myAccount.applyInterest();


            } else {

                System.out.println("Wrong Input.");

            }


        }


    }
}
