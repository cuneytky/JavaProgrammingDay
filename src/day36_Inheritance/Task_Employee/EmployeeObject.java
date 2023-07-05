package day36_Inheritance.Task_Employee;

public class EmployeeObject {
    public static void main(String[] args) {

        Tester tester=new Tester();
        tester.setInfo("kaya","A123","SDET",'M',40,120000);
        tester.testing();
        tester.creatingTicket();
        System.out.println(tester);

        System.out.println("--------------------");

        Driver driver=new Driver();
        driver.setInfo("Adam","B123","Driver",'M',45,140000);
        System.out.println(driver);
        driver.drivering();

        System.out.println("--------------------");

        Developer developer=new Developer();
        developer.setInfo("Azra","C123","Developer",'F',35,135000);
        System.out.println(developer);
        developer.coding();
        developer.fixingBugs();

        System.out.println("--------------------");

        Teacher teacher=new Teacher();
        teacher.setInfo("Elif","D123","Teacher",'F',30,110000);
        System.out.println(teacher);
        teacher.teaching();

        System.out.println("--------------------");


    }
}
//2.7 Create a class named Employee Objects and and test of the sub class' objects