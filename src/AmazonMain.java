public class AmazonMain {
    public static void main(String[] args){
        AmazonAccountDetails t1 = new AmazonAccountDetails();
        t1.userName = "Sudheer";
        t1.passWord = "Sudheer";
        AmazonLoginProcess t2 = new AmazonLoginProcess();
        boolean t3 = t2.login(t1);
        if(t3){
            System.out.println("Welcome " + (t1.userName));
            AmazonProductSelectionProcess sel = new AmazonProductSelectionProcess();
            AmazonProductPriceCalc price = new AmazonProductPriceCalc();
            sel.productPrice = 100.20;
            sel.productName = "Samsung mobile";
            sel.productQty = 100;
            Double t5 = price.productPriceCalc(sel);
            UserBankAccount user = new UserBankAccount();
            if (t5 < user.amount) {

                System.out.println("Order is Processed and final amount is : " + (t5));
            }
            else {
                System.out.println("Amount is insufficient in Bank Account");
            }


        }
        else{
            System.out.println("Login Failed");

        }
    }
}
