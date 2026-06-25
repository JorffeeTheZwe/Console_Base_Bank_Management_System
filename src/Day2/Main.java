package Day2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean flag = true;

        double amou = 0;


        System.out.print("Enter your ID :");
        int userId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your Name :");
        String name = scanner.nextLine();

        Account acc = new SavingAccount(userId, name, amou);


        while (flag) {

            System.out.print("Deposit(D) or Withdraw(W) or View Transaction History(T) or" +
                    " View Account Details(V) or Delete Account(L) or Exit(E) : ");
            char ch = scanner.next().charAt(0);


            if (ch == 'D') {


                System.out.print("Enter Deposit Amount :");

                amou = scanner.nextDouble();
                acc.Deposit(amou);


            } else if (ch == 'W') {

                System.out.print("Enter Withdraw Amount :");

                amou = scanner.nextDouble();

                acc.Withdraw(amou);




            } else if (ch == 'T') {


                System.out.print("View Transaction History :");



                acc.TransactionHistory();

            }else if(ch=='V'){

                System.out.println("Enter your account details :");

                acc.viewAccountDetails();




            } else if (ch == 'L') {

                System.out.println("Enter Id  for delete :");

                acc.delete();


            } else if (ch == 'E') {

                System.out.println("Program Exit.");

                flag = false;


            } else {

                System.out.println("Wrong Input.");

            }


        }




    }
}
