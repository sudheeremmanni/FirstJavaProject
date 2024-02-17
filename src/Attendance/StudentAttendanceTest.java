package Attendance;

public class StudentAttendanceTest {
    StudentAttendance getStudentAttenance(StudentAttendance t3){
        if (t3.noOfDays >= 18) {
            t3.result = "Pass";

        } else {
            t3.result = "Fail";

        }
        return t3;

    }
    public static void main(String args[]){
        StudentAttendanceTest t1 = new StudentAttendanceTest();
        StudentAttendance t2 = new StudentAttendance();
        t2.month = "January";
        t2.noOfDays = 22;
        StudentAttendance finalResult  = t1.getStudentAttenance(t2);
        System.out.println(finalResult);

    }
}
