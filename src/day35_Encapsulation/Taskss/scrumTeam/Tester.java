package day35_Encapsulation.Taskss.scrumTeam;
public class Tester {
    private String name, jobTitle,employeeID;
    private double salary;
    public Tester(String name, String jobTitle, String employeeID, double salary) {
        setName(name);
        setJobTitle(jobTitle);
        setEmployeeID(employeeID);
        setSalary(salary);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary<0) {
            System.out.println("salary can not be negative.");
            return;
        }
        this.salary = salary;
    }
    public void smokeTesting(){
        System.out.println(name+" is smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employeeID='" + employeeID + '\'' +
                ", salary= $" + salary +
                '}';
    }
}
/*
day 31 scrum team task;
create a class called Tester
	        Attributes:
	            name, employeeID, JobTitle, Salary
	        Add A constructor that can set all the fields
	        Actions:
	           smokeTesting(),  creatingTicket(),  toString()
 */