package day33_Statics.Tasks;

public class T01_CydeoStudent {

    public String name;
    public int age, ID, batchNumber, groupNumber;
    public  char gender, grade;
    public static String schoolName;
    public static String programmingLanguage;

    public T01_CydeoStudent(String name, int age, int ID, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.ID = ID;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public static String printSchoolName(){
        return  "cydeoSchool";
    }
    public static String printProgLanguage="SDET";

    public String toString() {
        return "T01_CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID=" + ID +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                 '}';
    }

    public void attendClass(){
        System.out.println(name+" is attend class");
    }
    public void study(){
        System.out.println(name+" is study");
    }


}
/*
1. CydeoStudent Task
		1. Create a class named CydeoStudent:
	Attributes:
	instances: name, age, gender, id, grade, batchNumber, groupNumber
	statics: schoolName, programmingLanguage

	Add a constructor that can set All the fields (instances)
				Actions:
		study()
		attendClass()
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of programming language
		toString()
 */
