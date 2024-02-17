public class GenerateStdNumber {
    String generateNumber(String stdName, String courseName, String mobileNumber, String emailId){
        return "Std001";
    }

    String stdPassOrFail(String stdName, String courseName, int marks){
        if (marks >= 35){
            return "Pass";
        }
        else{
            return "Fail" ;
        }

    }

    String stdPassOrFail1(Student std){
       /* //std.stdName = "Mahesh";
        //std.curseName = "MSC";
        //std.mobileNumber= "990900";
        //std.emailId = "sss@gmail.com";
        //std.marks = 34;
*/
        if (std.marks >= 35){
            return "Pass";
        }
        else{
            return "Fail" ;
        }

    }

}
