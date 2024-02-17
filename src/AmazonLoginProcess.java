public class AmazonLoginProcess {
    public boolean login(AmazonAccountDetails account){
        String name = "Sudheer";
        String pwd = "Sudheer";
        if((name.equals(account.userName)) && (pwd.equals(account.passWord)) ) {
            return true;
        }
        else {
            return false;
        }
    }
}
