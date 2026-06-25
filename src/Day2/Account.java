package Day2;

import java.util.*;

public abstract class Account {

    ArrayList<String> tranHistory;

    private final int accountNumber; // ပိုက်ဆံ ကိစ္စ ဖြစ် လို့ တစ်ခါ သတ်မှတ်ပြီး ရင် ပြန် မပြောင်းနိုင်အောင် final ထား

    private String owner_name;

    private  double balance;

    protected Account(int accountNumber,String owner_name,double balance) {
        this.accountNumber = accountNumber;
        this.owner_name=owner_name;
        this.balance=balance;
        this.tranHistory =new ArrayList<>();



        tranHistory.add("Account Open Successfully.Current Balance is :"+balance);
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }


    public void Deposit(double amount) {

        if(!isActive) {

            System.out.println("Account Not Found.");

            return;
        }


            if (amount > 0) {


                balance = balance + amount;

                System.out.println("Deposit Done " + amount);

                tranHistory.add("Deposit :" + amount + "Balance :" + balance);

            } else {

                System.out.println("Something Wrong.");



        }
    }


    public void Withdraw(double amount){

        if(!isActive){

            System.out.println("Account Not Found.");

            return;
        }

        if(balance >= amount){

            balance = balance - amount;

            System.out.println("Widthdraw Done :"+amount);

            tranHistory.add("Withdraw Done :"+amount+"| Balance :"+balance);



        }else{

            System.out.println("Insufficient amount.");

        }


    }

    public void Transfer(Account target_account , double amount){

if(balance > amount){

    Withdraw(amount);

    target_account.Deposit(amount);

    System.out.println("Transaction Successful.");

}else{

    System.out.println("Transaction Fail.Insufficient Balance.");

}




    }

    public void viewAccountDetails(){

        System.out.println("Account Number :"+accountNumber);

        System.out.println("Account Owner Name :"+owner_name);

        System.out.println("Account Balance :"+balance);

    }


    public void TransactionHistory(){

        if(!isActive){

            System.out.println("Account Not Found.");

            return;

        }

        System.out.println("Transcation History for account :"+this.accountNumber);

        for(String h : tranHistory){

            System.out.println(h);
        }

    }

    boolean isActive=true;

    public void delete(){

       tranHistory.clear();

       this.balance=0;

       this.owner_name=null;

       this.isActive=false;

       System.out.println("Account Deleted Successfully.");

    }


}
