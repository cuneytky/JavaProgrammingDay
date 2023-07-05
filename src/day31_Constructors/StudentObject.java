package day31_Constructors;

public class StudentObject {

    public static void main(String[] args) {

        Student student1 = new Student("Hulya", 26, 'F', 'B', 13);

        Student student2 = new Student("Ali",30,'M','A',42);

        System.out.println(student1);//Student{name='Hulya', age=26, gender=F, grade=B, id=13}
        System.out.println(student2);//Student{name='Ali', age=30, gender=M, grade=A, id=42}


    }

}
