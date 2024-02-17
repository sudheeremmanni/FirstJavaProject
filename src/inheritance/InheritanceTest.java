package inheritance;

public class InheritanceTest {
    public static void main(String[]args){
       // RetailAccount account = new Account("222",23232,true); - down casting is not possible
        //downcasting explicitly is possible as but we dont use downcasting- no compile time error
        //but it will throws ClassCastException in runtime
      //  RetailAccount account =(RetailAccount)new Account("222",23232,true);
        //upcasting is possible -> converting subclass object to superclass refernce
       Account retailAccount = new RetailAccount("1233",21212,true);

       /*RetailAccount retailAccount1 = new RetailAccount("1233",21212,true);

       String result = retailAccount1.getDeposit();
       System.out.println(result);
    */}
}
