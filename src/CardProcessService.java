public class CardProcessService {

    String login(CardDetails cardDetails){
        String cardNumber = "1234 1234 1234";
        String pinNumber = "1234";

        if ( (cardNumber.equals(cardDetails.cardNumber)) && (cardNumber.equals(cardDetails.pinNumber)))
        {
            return "Login Success";

        }
        else{

            return "Login Failed";
        }
    }
}
