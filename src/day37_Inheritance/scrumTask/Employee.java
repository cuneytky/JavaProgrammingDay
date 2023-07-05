package day37_Inheritance.scrumTask;
public class Employee extends Person{  // Employee IS A Person

    public String jobTitle;
    public int id;
    public double salary;
    public String companyName;
    // bu 4 ünü yazınca constructor ile bunlaı secip enter basınca sağıdaki tamamı gelir.
    // super kısmı parentten kalanı yadığımız..

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
        this.salary = salary;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }

    // to string içi 4 +3 şeklinde görunuecek hepsi sectık.
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}


/*
name, gender, age, jobTitle, id, salary, companyName
 work(), toString()
 */