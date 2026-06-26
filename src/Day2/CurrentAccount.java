package Day2;

public class CurrentAccount extends Account{

    private double overdrift;


    protected CurrentAccount(int accountNumber,String owner_name,double balance,double overdrift) {
        super(accountNumber,owner_name,balance);

        this.overdrift=overdrift;
    }

    @Override
    public void applyInterest(){

        System.out.println("Current Account does not support interest.");

    }


    public void Withdraw(double amount){

        if(amount < 0) return ;

        if(amount <= balance){

            balance = balance - amount ;

            System.out.println("Withdraw Done.");

        }else if(amount <= (balance+overdrift)){

            double fromOverdraft=amount-balance;
            balance=0;

            overdrift= overdrift-fromOverdraft;

            System.out.println("Withdraw form overdrift.");

            tranHistory.add("Withdraw from overdraft: " + amount);



        }else{

            System.out.println("Exceed Limit");

        }

    }
}
