package School;

public class StudentForm {
    public String name;
    public String fatherName;
    public String mobileNo;
    public String dateOfBirth;
    public int rollNo;
    public String schoolName;

   public StudentAddress address;

   public StudentMarks marks;

   public String result;

    @Override
    public String toString() {
        return "StudentForm{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", rollNo=" + rollNo +
                ", schoolName='" + schoolName + '\'' +
                ", address=" + address +
                ", marks=" + marks +
                ", result='" + result + '\'' +
                '}';
    }
}
