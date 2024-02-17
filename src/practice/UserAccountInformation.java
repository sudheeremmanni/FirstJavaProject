package practice;

public class UserAccountInformation {

    private String userName;
    private String accountType;
    private int amount;
    public Bank bankDetails;
    public Transfer transferDetails;

    public UserAccountInformation() {
        this.userName = "Ramesh";
        this.accountType = "Savings";
        this.amount = 38898989;

    }

    public UserAccountInformation(String userName, String accountType, int amount, Bank bankDetails, Transfer transferDetails) {
        this.userName = userName;
        this.accountType = accountType;
        this.amount = amount;
        this.bankDetails = bankDetails;
        this.transferDetails = transferDetails;
    }


    /*public UserAccountInformation(String userName, String accountType, int amount, Bank bankDetails) {
        this.userName = userName;
        this.accountType = accountType;
        this.amount = amount;
        this.bankDetails = bankDetails;
    }*/

    public UserAccountInformation(String userName, String accountType, int amount)
    {
        this(userName,accountType,amount,new Bank(), new Transfer());
        this.userName = userName;
        this.accountType = accountType;
        this.amount = amount;
        this.bankDetails = bankDetails;
    }


    public String getUserName() {
        return this.userName;
    }

    public String getAccountType() {
        return this.accountType;
    }

    public int getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        return "UserAccountInformation{" +
                "userName='" + userName + '\'' +
                ", accountType='" + accountType + '\'' +
                ", amount=" + amount +
                ", bankDetails=" + bankDetails +
                ", transferDetails=" + transferDetails +
                '}';
    }
}

