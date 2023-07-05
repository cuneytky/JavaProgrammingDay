package day38_Inheritance.tasks_employee;

public class EmployeeObject {
    public static void main(String[] args) {
        Tester tester = new Tester("Kaya","A500",41,'M');
        System.out.println(tester);
        tester.work();

        Developer developer = new Developer("Adam","B500",35,'M');
        System.out.println(developer);
        developer.work();
    }
}
