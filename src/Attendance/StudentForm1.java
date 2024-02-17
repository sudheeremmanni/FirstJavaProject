package Attendance;

public class StudentForm1 {
    public String name;
    public String fatherName;
    public String mobileNo;
    public String dateOfBirth;
    public StudentAttendance attendance;
    public String result;

    @Override
    public String toString() {
        return "StudentForm1{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", attendance=" + attendance +
                ", result='" + result + '\'' +
                '}';
    }
}
