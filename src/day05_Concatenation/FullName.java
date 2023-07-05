package day05_Concatenation;
public class FullName {
    public static void main(String[] args) {
        String firstName = "Cuneyt";
        String lastName = "Kaya";
        int age = 40;
        String jobTitle = "Developer";
        String companyName = "Abcd company";
        double salary = 125000.00;
        String fullName = firstName + " "  + lastName;

        System.out.println("Full name of the person is " + fullName );
        System.out.println(fullName + " is " + age +" years old"  );
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +", and "+fullName +"'s salary is $"+salary );
    }
}
/*
TASK-1 :
2. Declare the following variables:
             1. firstName
             2. lastName
3. Use concatenation to print the full address
 */
