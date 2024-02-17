package Marks;


import School.StudentForm;
import School.StudentMarks;

public class StudentPassOrFail {
    //StudentMarks getStudentResult(StudentMarks s1){
      //  StudentMarks localMarks = new StudentMarks();

        //localMarks.telugu = s1.telugu;
        //localMarks.hindi = s1.hindi;
        //localMarks.english = s1.english;
        //localMarks.maths = s1.maths;
        //localMarks.science = s1.science;
        //localMarks.social = s1.social;

        //StudentSubject sub = new StudentSubject();




        //localMarks.telugu = ;
       // localSubject.subjectName = "Hindi";
       // localMarks.english.subjectMarks = 80;

        //localMarks.hindi.subjectMarks = 70;
        //localMarks.maths.subjectMarks = 100;
        //localMarks.social.subjectMarks = 90;
        //localMarks.science.subjectMarks = 70;

       // return localMarks;

        //localSubject.subjectMarks = localMarks;
        //return localSubject;




   // }
    public boolean isPassed(StudentSubject sub1){
        System.out.println("from is Passed" + sub1.subjectName);
        return sub1.subjectMarks >=35;
    }

    public boolean isHindiPassed(StudentSubject sub1){
        System.out.println("from is Passed" + sub1.subjectName);
        return sub1.subjectMarks >=21;
    }
    StudentForm getStudentResult(StudentForm studentForm){
       // if (studentForm.marks.telugu.subjectMarks >= 35 && studentForm.marks.english.subjectMarks >=35 &&
         //       studentForm.marks.hindi.subjectMarks >=35 && studentForm.marks.maths.subjectMarks >= 35 &&
           //    studentForm.marks.science.subjectMarks >=35 &&studentForm.marks.social.subjectMarks >=35){
          //studentForm.result = "Pass";
       // } else {
         // studentForm.result = "Fail";
       //}
        if (isPassed(studentForm.marks.telugu)){
            studentForm.marks.telugu.result = "Pass";
        }
        else {
            studentForm.marks.telugu.result = "Fail";
        }
        if (isPassed(studentForm.marks.hindi)){
            studentForm.marks.hindi.result = "Pass";
        }
        else {
            studentForm.marks.hindi.result = "Fail";
        }
        if (isPassed(studentForm.marks.english)){
            studentForm.marks.english.result = "Pass";
        }
        else {
            studentForm.marks.english.result = "Fail";
        }
        if (isPassed(studentForm.marks.maths)){
            studentForm.marks.maths.result = "Pass";
        }
        else {
            studentForm.marks.maths.result = "Fail";
        }
        if (isPassed(studentForm.marks.science)){
            studentForm.marks.science.result = "Pass";
        }
        else {
            studentForm.marks.science.result = "Fail";
        }
        if (isPassed(studentForm.marks.social)){
            studentForm.marks.social.result = "Pass";
        }
        else {
            studentForm.marks.social.result = "Fail";
        }

        if (studentForm.marks.telugu.result.equals("Pass")  &&
                studentForm.marks.hindi.result.equals("Pass") &&
                studentForm.marks.english.result.equals("Pass")  &&
                studentForm.marks.maths.result.equals("Pass") &&
                studentForm.marks.science.result.equals("Pass") &&
                studentForm.marks.social.result.equals("Pass") ){
                studentForm.result = "Pass";
                 } else {
                 studentForm.result = "Fail";
                }
        return studentForm;

    }
    public static void main(String[] args){

        StudentSubject teluguSubject = new StudentSubject();
        teluguSubject.subjectMarks = 72;
        teluguSubject.subjectName = "Telugu";
        StudentSubject hindiSubject = new StudentSubject();
        hindiSubject.subjectName = "Hindi";
        hindiSubject.subjectMarks = 80;
        StudentSubject englishSubject = new StudentSubject();
        englishSubject.subjectMarks = 90;
        englishSubject.subjectName = "English";
        StudentSubject mathsSubject = new StudentSubject();
        mathsSubject.subjectName = "Maths";
        mathsSubject.subjectMarks = 100;
        StudentSubject scienceSubject = new StudentSubject();
        scienceSubject.subjectMarks = 70;
        scienceSubject.subjectName = "Science";
        StudentSubject socialSubject = new StudentSubject();
        socialSubject.subjectName = "Social";

        socialSubject.subjectMarks = 90;

        StudentMarks marks = new StudentMarks();
        marks.telugu = teluguSubject;
        marks.hindi = hindiSubject;
        marks.english = englishSubject;
        marks.maths = mathsSubject;
        marks.science = scienceSubject;
        marks.social = socialSubject;

        StudentForm form = new StudentForm();
        form.marks = marks;
        form.name = "Sudheer";
        form.fatherName = "Satyanarayana";
        form.mobileNo = "99999";
        form.dateOfBirth = "01/01/2010";


        StudentPassOrFail t1 = new StudentPassOrFail();
        StudentForm t2 = t1.getStudentResult(form);
        System.out.println(t2.toString());




    }
}
