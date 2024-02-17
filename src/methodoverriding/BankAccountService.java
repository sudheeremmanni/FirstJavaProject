package methodoverriding;

public class BankAccountService {
    int fromAccountAmt = 0;
    int toAccountAmt = 0;

    String frmAccount = null;
    String toAccount = null;
    public boolean login(){
        return true;
    }

    public boolean transfer(String fromMobileNumber, String toMobilNumber, int amt){

        System.out.println(("from Super Class BankAccountService"));

        if(fromMobileNumber.equals("12345")){
            frmAccount = "111";
        }
        if(toMobilNumber.equals("45678")){
            toAccount = "222";
        }
        return this.bookTransfer(frmAccount,toAccount,amt);

    }

    private boolean bookTransfer(String fromAccount, String toAccount, int amt){

        toAccountAmt = toAccountAmt + amt;  //method to the bank account
         fromAccountAmt = fromAccountAmt -amt;

        return true;
    }
}
