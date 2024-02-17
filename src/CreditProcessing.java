public class CreditProcessing {
    Double amount1 =0.0; // It will take default value
    Double creditFunction(CreditDetails details){
        String cardNumber = "1234 1234 1234";

      //  Double amount1 = 0.0;

        if (cardNumber.equals(details.cardNumber)) {
            amount1 = amount1 + details.amount;
        }
        return amount1;
    }
}
