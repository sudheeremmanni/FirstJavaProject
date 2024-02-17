package constructoroverloading;

public class ConstructTest {
    public static void main(String args[]){
        Address address = new Address();
        address.city = "KPHB";
        address.pinCode= "1234";
        Student student= new Student("Kumar", "Kumar", "01/01/01","1234",address);

        System.out.println(student);
        Student examStudent = new Student("Kumar", "Kumar", "01/01/01","1234");
        System.out.println(examStudent);
    }
}
