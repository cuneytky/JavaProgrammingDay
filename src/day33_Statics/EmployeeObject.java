package day33_Statics;

public class EmployeeObject {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmet";
        employee1.salary = 110000;

        Employee employee2 = new Employee();
        employee2.name = "Aygun";
        employee2.salary = 115000;

        Employee employee3 = new Employee();
        employee3.name = "Fady";
        employee3.salary = 120000;

        System.out.println( employee1.name +" : "+employee1.salary ); //Ahmet : 110000.0
        System.out.println( employee2.name +" : "+employee2.salary);  //Aygun : 115000.0
        System.out.println( employee3.name +" : "+employee3.salary);  //Fady : 120000.0


        System.out.println( employee1.isHuman ); //true
        System.out.println( employee2.isHuman ); //true
        System.out.println( employee3.isHuman ); //true



        int a = 100;
        a = 200;
        a = 300;




    }

}
