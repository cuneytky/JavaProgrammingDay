package day23_CustomMethods_Void;
public class Tasks05_GradeOfStudents {
    public static void main(String[] args) {
        gradeOfStudent(65);
    }
    public static void gradeOfStudent(int score){
        String grade ="";
        if(score>=0 && score<=100)
        grade = score>=90? "A": score>=80? "B": score>=70? "C": score>=60? "D":"F";
        System.out.println("Grade: "+grade);
    }
}
// 5. create a method that can calculate the grade of the student based on the score
