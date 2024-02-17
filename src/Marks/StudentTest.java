package Marks;

import School.StudentAddress;
import School.StudentForm;

public class StudentTest {
    StudentForm getRollNo(StudentForm student) {
        String name = "Ramesh";
        int rollNo = 101;
        if (name == student.name) {
            student.rollNo = rollNo;
        } else {
            student.rollNo = rollNo +1 ;
        }
        return student;
    }
    StudentForm getSchoolName(StudentForm st){
       //shallow cloning
        st.schoolName = "Chirec";
        return st;
    }
    StudentForm getSchoolNameDeepClone(StudentForm student1) {
        //Deep Cloning
        StudentForm clonedStudent = new StudentForm();
        clonedStudent.name = student1.name;
        clonedStudent.fatherName = student1.fatherName;
        clonedStudent.mobileNo = student1.mobileNo;
        clonedStudent.dateOfBirth = student1.dateOfBirth;
        clonedStudent.rollNo = student1.rollNo;

        // if (f1.name.startsWith("R")){
        clonedStudent.schoolName = "Chirec School";
        System.out.println(clonedStudent.hashCode());
        System.out.println(student1.hashCode());
        return clonedStudent;

    }

        StudentForm getStudentAddress(StudentForm studentAddress) {
         // other method of writing
        //studentAddress.address = "Hyderabad";
        //return  studentAddress;
        //Deep Cloning method
            StudentForm studentAddressDeepClone = new StudentForm();
            StudentAddress add1 = new StudentAddress();
            add1.address = "Bangalore";
            add1.state = "KARNATAKA";

            studentAddressDeepClone.name = studentAddress.name;
            studentAddressDeepClone.fatherName = studentAddress.fatherName;
            studentAddressDeepClone.mobileNo = studentAddress.mobileNo;
            studentAddressDeepClone.dateOfBirth = studentAddress.dateOfBirth;
            studentAddressDeepClone.schoolName = studentAddress.schoolName;
            studentAddressDeepClone.rollNo = studentAddress.rollNo;

            studentAddressDeepClone.address = add1;
            return studentAddressDeepClone;

        }


    public static void main(String[] args){
        StudentForm s1 = new StudentForm();
        StudentForm s2 = new StudentForm();

        s1.name = "Ramesh";
        s1.fatherName = "Mahesh";
        s1.mobileNo = "1234";
        s1.dateOfBirth = "01/01/20";


        s2.name = "Kumar";
        s2.fatherName = "Raja";
        s2.mobileNo = "222222";
        s2.dateOfBirth = "01/01/01";

        StudentTest t1 = new StudentTest();

        StudentForm t3 = t1.getRollNo(s1);
        System.out.println(t3.rollNo);
        StudentForm t4 =t1.getRollNo(s2);
        System.out.println(t4.rollNo);
        StudentForm t5 = t1.getSchoolName(s1);
        System.out.println(t5.schoolName);
        StudentForm t6 =t1.getSchoolNameDeepClone(s2);
        System.out.println(t6.schoolName);

        StudentForm studentAddress = t1.getStudentAddress(s1);
        //System.out.println(studentAddress.address.state);
        System.out.println(studentAddress.address.toString());

    }
}
