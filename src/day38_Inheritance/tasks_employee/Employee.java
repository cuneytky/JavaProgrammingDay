package day38_Inheritance.tasks_employee;

public class Employee {
    private String name, ID, jobTitle;
    private int age;
    private char gender;
    private static String salaryName, companyName;


    public Employee(String name, String ID, String jobTitle, int age, char gender) {
        setName(name);
        setID(ID);
        setJobTitle(jobTitle);
        setAge(age);
        setGender(gender);
    }

    static {
        salaryName="Dollar";
        companyName="Cydeo";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void work(){
        System.out.println("working");
    }

    @Override
    public String toString() {
        return "Employee{" +
                " Company Name: "+ companyName+
                ", Salary Name: "+salaryName+
                ", name=' " + name + '\'' +
                ", ID='" + ID + '\'' +
                ", jobTitle=' " + jobTitle + '\'' +
                ", age= " + age +
                ", gender= " + gender +
                '}';
    }
}
/*
day_38_optional_task-3:
Employee Task:
	1. Create a class named Employee
			Variables:
				name, age, gender, id, jobTitle, salaryName, comapnyName

			Add a constructor to set all the fields

			Methods:
				work()
				toString()
	2. Create ethe following subclasses and override the work method in each subclass:
			1. Tester
			2. Developer
			3. ProductOwner
			4. BusinessAnalyst
			5. ScrumMaster
			6. Teacher
			7. Driver
			9. Pilot
		if any adidtional field or methods needed, please add them
 */