package day30_CustomClass;
import java.util.ArrayList;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student student2 = new Student();
        student2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student student3 = new Student();
        student3.setInfo("Elminur", 'F',26,2215,'A');

        Student student4 = new Student();
        student4.setInfo("Ali", 'M',28,5511,'B');

        Student student5 = new Student();
        student5.setInfo("Mert", 'M', 26 ,2252, 'C');


        Student[] students = {student1, student2, student3, student4, student5};

        for (Student student : students) {  //Student{name='Aygun', gender=F, age=39, ID=2210, grade=A}
            System.out.println(student);   // Student{name='Hulya', gender=F, age=26, ID=2123, grade=B}
        }                                 // ...

        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); // grade: A
        ArrayList<Student> angryBirds = new ArrayList<>();

        for (Student student : students) {

            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }

        }

        System.out.println(earlyBirds);//[Student{name='Aygun', gender=F, age=39, ID=2210, grade=A}, Student{name='Elminur', gender=F, age=26, ID=2215, grade=A}]

        System.out.println(angryBirds);//[Student{name='Hulya', gender=F, age=26, ID=2123, grade=B}, Student{name='Ali', gender=M, age=28, ID=5511, grade=B}, Student{name='Mert', gender=M, age=26, ID=2252, grade=C}]


    }


}
