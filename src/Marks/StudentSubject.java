package Marks;

public class StudentSubject {
    public String subjectName;
    public int subjectMarks;

    public String result;

    @Override
    public String toString() {
        return "StudentSubject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectMarks=" + subjectMarks +
                ", result='" + result + '\'' +
                '}';
    }
}
