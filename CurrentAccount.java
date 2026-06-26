package Day2;

public class CurrentAccount extends Account{


    protected CurrentAccount(int accountNumber,String owner_name,double balance) {
        super(accountNumber,owner_name,balance);
    }

    @Override
    public void applyInterest(){

        System.out.println("Current Account does not support interest.");

    }
}
