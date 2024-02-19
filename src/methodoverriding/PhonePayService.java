package methodoverriding;

public class PhonePayService extends BankAccountService{
    public boolean transfer(String fromMobileNumber, String toMobileNumber, int amt){

        System.out.println(("from sub Class BankAccountService"));
        return super.transfer(fromMobileNumber,toMobileNumber,amt);

    }

}
