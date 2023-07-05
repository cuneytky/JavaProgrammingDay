package day32_Constructor;

public class Employee {

    public String name;
    public char gender;
    public String jobTitle;
    public double salary;

  // multiply constructors.....

    /*
public void method1(){
    System.out.println("Method 1");
}
public void method2(){ // regular method ta method içinde method cagırırız
    method1();  // cons. bunu yapabilmke icin this kullanmak zorundayız.
}
*/
    public Employee(String name){
        this.name = name; // --> reuse this
        // this(name); -- kendini call edemez..rule-5...
    }

    public Employee(String name, char gender){
        // Employee name --> olarak kullanamayız!!! onun yerine...
        this(name); //this.name = name; --> rule 1
        this.gender = gender;

    }

    public Employee(String name, char gender, String jobTitle){
        this(name, gender);
        this.jobTitle = jobTitle;
    }

    public Employee(String name, char gender, String jobTitle, double salary){
        this(name, gender, jobTitle);// bir oncekinde call ettik...
        this.salary = salary;        // rule-3 ocelikle call et(first step)
                                     // dıgerlerını sonra yaz
        // buda rule-4 i getirir yalnız 1 cons. da 1 kez cagırabilirsin
    }
    /*
    this: refers to the instances
	this. : to call instance variables & instance methods
	this() : used for calling the constructors

Constructor Call:
		1. Constructor can not be called by its name ( this() need to be used )
		2. Only a constructor can call another constructor
		3. Constructor call MUST be at the first step
		4. One constructor can not call more than one constructor
		5. Constructor can not call or contain itself
     */


    /*
    public void method1(){ // rule-2 ..only cons. olmalı baska method olmaz
        this("Aaron");
    }
*/

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }






}
