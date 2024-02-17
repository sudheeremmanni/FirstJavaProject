package methodoverriding;

public class MethodOverrideTest {
    public static void main(String[] args){

        PhonePayService phonePayService = new PhonePayService();
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        phonePayService.transfer("12345","45678",100);
        System.out.println("To account amount"+phonePayService.toAccountAmt);

        phonePayService.login();

        BankAccountService bankAccountService = new BankAccountService();
        bankAccountService.transfer("12345","45678",100);


        BankAccountService bankAccountServiceUpcast = new PhonePayService();
        bankAccountServiceUpcast.transfer("12345","45678",100);

    }
}
