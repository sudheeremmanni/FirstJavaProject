public class Test {
    public static void main(String args[]){

        // TicketBookService t = new TicketBookService();
        //Ticket t1 = t.bookTicket(6, "Balcony", "H", "6:30");
       // System.out.println(t1);
      //  System.out.println("Test");
        GenerateStdNumber t2 = new GenerateStdNumber();
        String t3 = t2.generateNumber("Sudheer", "MCA", "88888","www");
        System.out.println(t3);

        String t4 = t2.stdPassOrFail("Sudheer", "MCA", 75);
        System.out.println(t4);

        Student t5 = new Student();
        t5.stdName = "Mahesh";
        t5.curseName = "MSC";
        t5.mobileNumber= "990900";
        t5.emailId = "sss@gmail.com";
        t5.marks = 34;
        String t6 = t2.stdPassOrFail1(t5);
        System.out.println(t6);

        CardDetails t7 = new CardDetails();
        CardProcessService t8 = new CardProcessService();
        t7.cardNumber = "1234 1234 1233";
        t7.pinNumber = "1234";
        String t9 = t8.login(t7);
        System.out.println(t9);
    }
}
