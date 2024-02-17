package Attendance;

public class StudentAttendance {
    public String month;
    public int noOfDays;
    public String result;

    @Override
    public String toString() {
        return "StudentAttendance{" +
                "month='" + month + '\'' +
                ", noOfDays=" + noOfDays +
                ", result='" + result + '\'' +
                '}';
    }
}
