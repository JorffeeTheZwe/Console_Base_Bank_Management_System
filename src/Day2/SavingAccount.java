package Day2;

public class SavingAccount extends Account{

    private double interestRate;


    protected SavingAccount(int accountNumber,String owner_name,double balance,double interestRate) {
        super(accountNumber,owner_name,balance);

        this.interestRate=interestRate;
    }



    public double calculateInterest(){

       return balance * interestRate;



    }



    public void applyInterest(){

        double interestAmount=calculateInterest();

        Deposit(interestAmount);

        System.out.println("Interest "+interestAmount+"added into the your account balance successfully.");


    }


}
