public class ExamResult {
    
    public boolean isPass(int marks) {
        
        // Update Code : If the student's marks are greater than 50, they have passed the exam.
        if(marks > 50){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ExamResult s1=new ExamResult();
        ExamResult s2=new ExamResult();
        System.out.println("Student with 62 marks is "+(s1.isPass(62)?"PASS":"FAIL"));
        System.out.println("Student with 23 marks is "+(s2.isPass(23)?"PASS":"FAIL"));
        }
}
