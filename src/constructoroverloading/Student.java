package constructoroverloading;

public class Student {
    public String name;
    public String fatherName;
    public  String dob;
    public String mobile;
    public Address address;

    public Student(String name,String fatherName, String dob, String mobile, Address address){
        this.name = name;
        this.fatherName= fatherName;
        this.dob= dob;
        this.mobile = mobile;
        this.address  = address;
    }
    public Student(String name,String fatherName, String dob, String mobile){

        this(name,fatherName,dob,mobile, new Address());
        this.name = name;
        this.fatherName= fatherName;
        this.dob= dob;
        this.mobile = mobile;
      //  this.address  = address;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", mobile='" + mobile + '\'' +
                ", address=" + address +
                '}';
    }
}
