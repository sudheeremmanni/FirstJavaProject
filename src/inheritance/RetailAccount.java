package inheritance;

public class RetailAccount extends InsuranceAccount{
    private int minimumBalance=100;
    private int limit=20;

    private int amount;

    //Account account = new Account();
    public RetailAccount(String accountNumber, int balance, boolean status) {
        super(accountNumber, balance, status);
        this.amount = balance;
    }

    public String getDeposit(){

       // int balance = account.getBalance();
        amount = amount + 20000;
        return "amount deposited" + amount;
    }
}
