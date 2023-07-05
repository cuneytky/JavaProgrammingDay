package day33_Statics.Tasks;

import day33_Statics.Tasks.T01_CydeoStudent;

import static day33_Statics.Tasks.T01_CydeoStudent.printProgLanguage;
import static day33_Statics.Tasks.T01_CydeoStudent.printSchoolName;

public class T01_CydeoStudentObject {

    public static void main(String[] args) {

        T01_CydeoStudent student1 = new T01_CydeoStudent("Nicholas",35,10,11,11,'M','A');
        T01_CydeoStudent student2 = new T01_CydeoStudent("Nisa",30,12,11,9,'F','B');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.name+": "+ printSchoolName()+"- "+ printProgLanguage);
        student1.study();
        student2.attendClass();



    }
}
