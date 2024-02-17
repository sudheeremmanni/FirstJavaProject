package Attendance;

import School.StudentForm;

public class AttendanceTest {
    StudentForm1 getStudentAttendanceResult(StudentForm1 at){

        if (at.attendance.noOfDays > 18){
            at.result = "Pass";
        } else {
            at.result = "Fail";
        }
        return at;

    }
    public static void main(String args[]){
        StudentForm1 form = new StudentForm1();
        form.name = "Sudheer";
        form.fatherName = "Satyanarayana";
        form.mobileNo = "99999";
        form.dateOfBirth = "01/01/2010";


        AttendanceTest test = new AttendanceTest();
        StudentAttendance janAttendance = new StudentAttendance();
        janAttendance.month = "Jan";
        janAttendance.noOfDays = 22;

        StudentAttendance febAttendance = new StudentAttendance();
        febAttendance.month = "Feb";
        febAttendance.noOfDays = 22;

        StudentAttendance marAttendance = new StudentAttendance();
        marAttendance.month = "Mar";
        marAttendance.noOfDays = 20;


        //form.attendance = attendance;

       StudentForm1 student =  test.getStudentAttendanceResult(form);
       System.out.println(student);

    }
}
