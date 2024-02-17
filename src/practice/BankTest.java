package practice;

public class BankTest {
    public static void main(String args[]){
        Bank bank = new Bank();
        Transfer transfer = new Transfer();
        transfer.transferType = "IMPS";
        transfer.transferAmount = 343433;
        transfer.transferDate = "02/10/24";
        transfer.transferMsg = "Successfull";
        int transfer1 = transfer.getTransferAmount("IMPS", 99999, "01/01/24");
        transfer.transferAmount = transfer1;

        UserAccountInformation user = new UserAccountInformation("Ramesh1","Savings", 9999, bank,transfer );
        System.out.println(user);

        UserAccountInformation user1 = new UserAccountInformation("Ramesh","Fixed Deposit", 999999);
        System.out.println(user1);

    }
}
