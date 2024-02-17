public class CreditMain {
    public static void main(String[] args) {
        CreditDetails t1 = new CreditDetails();
        CreditProcessing t2 = new CreditProcessing();
        t1.cardNumber ="1234 1234 1234";
        t1.amount = 100.40;
        Double t3 = t2.creditFunction(t1);
        System.out.println(t3);
        t1.amount = 5000.04;
        Double t4 = t2.creditFunction(t1);
        System.out.println(t4);


    }
}
