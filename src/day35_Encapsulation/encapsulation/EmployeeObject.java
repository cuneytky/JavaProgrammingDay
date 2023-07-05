package day35_Encapsulation.encapsulation;
public class EmployeeObject {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Tahir", 'M', 30, 120000);

        //employee1.age=32; ==> direk atayamayız set kullanmalıyız cunku private
        employee1.setAge(32);

        Employee employee2 = new Employee("Aygun", 'F', 31, 115000);
        employee2.setName("Elvira"); // ismi de değistirdık
        employee2.setSalary( employee2.getSalary() + 15000 );// orjınal salarye ekleme yaptık

        System.out.println(employee1);//Employee{name='Tahir', gender=M, age=32, salary=120000.0}
        System.out.println(employee2);//Employee{name='Elvira', gender=F, age=31, salary=130000.0}

        // verilen aralıklarda gırılmedıgınde sonuc...
        Employee employee3 = new Employee("", 'q', 0, -20);
        System.out.println(employee3); //Employee{name='null', gender= , age=0, salary=0.0}
    }
}
