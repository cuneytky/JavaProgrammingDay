package day39_Recap.cydeoTask;
public class Cydeo {
    public static void main(String[] args) {
        Developer developer = new Developer("Korkmaz", 29, 'M', 1, "Java Developer", 125000);
        Tester tester = new Tester("Olga", 27, 'F', 2, "SDET", 110000);
        Teacher teacher = new Teacher("Daniel", 32, 'M', 3, "Math Teacher", 100000);
        Student student = new Student("Suhaib", 30, 'M', 8, "SDET" );

        System.out.println(developer);
        System.out.println(tester);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("-----------------------------------------------------------------");

        developer.setAge(39); // set ile değistir

        System.out.println(developer.getAge()); // 39 -- get ile cağır

        System.out.println(developer); // değişip geldi

        System.out.println("-----------------------------------------------------------------");

        developer.work(); //Java Developer Korkmaz is developing the application
        tester.work(); //SDET Olga is testing the application
        teacher.work(); //Math Teacher Daniel is teaching
        //  student.work(); // bunun work u yok error verdı

        System.out.println("------------------------------------------------------------");

        developer.eat();  //Korkmaz is eating
        developer.drink();//Korkmaz is drinking
        developer.sleep();//Korkmaz is sleeping

        developer.fixingBugs();//Java Developer Korkmaz is fixing the bug

        System.out.println("------------------------------------------------------------");

        tester.eat(); //Olga is eating
        tester.drink(); //Olga is drinking
        tester.sleep(); //Olga is sleeping

        // tester.fixingBugs();
        tester.createTicket(); //SDET Olga is creating ticket

        System.out.println("------------------------------------------------------------");

        teacher.eat();//Daniel is eating
        teacher.drink();//Daniel is drinking
        teacher.sleep();//Daniel is sleeping

        // teacher.fixingBugs();
        //  teacher.createTicket();

        System.out.println("------------------------------------------------------------");

        student.eat(); //Suhaib is eating
        student.drink();//Suhaib is drinking
        student.sleep();//Suhaib is sleeping

        // student.fixingBugs();
        // student.createTicket();
        student.study(); //Suhaib is studying
    }
}
/*
    7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student
            test all the functions of each objects
            Analyze the relationships between the classes
 */