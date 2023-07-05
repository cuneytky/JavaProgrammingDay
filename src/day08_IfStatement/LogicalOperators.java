package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        String name ="Steven";
        int age = 17;
        String citizen = "USA";
        boolean isEligible =age>=18 && citizen=="USA";
                             //   19>=18 && "UK" =="USA"
                            //   true && false   --> false
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("-----------------------------");

        String name2 = "Josh";
        int creditScore = 800;
        int age2 =  23;
        int income = 40000;
        boolean isEligible2 = creditScore>=720  && age2 >= 21 && income>=60000;
        System.out.println(name2+" is eligible for loan: "+ isEligible2);

        System.out.println("-----------------------------");

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';
        boolean isEligible3 = age3>=18 && (gender=='F' || gender=='M');
        //                      21>=18 && ('F'=='M' || 'F'=='F'))
        //                      true && (false || true)
        //                          true && true                  ====>true
        System.out.println(name3+" is eligible for loan: "+ isEligible3);

        System.out.println("-----------------------------");

        String name4 = "James";
        String countryOfBirth = "UK";
        Boolean marriedToUSCitizen = false;
        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen==true;
        System.out.println(name4+" is eligible for loan: "+ isEligible4);

        System.out.println("-----------------------------");

        String student = "Anna";
        double gpa = 3.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa>= 3.5 || familyIncome<=60000;
        System.out.println(student+" is eligible for loan: "+ isEligible5); // true

        System.out.println("-----------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2); // true
        boolean result3 = !result2;
        System.out.println("result3 = " + result3); // false

        System.out.println("-----------------------------");

        int score = 85;
        boolean passed = score>=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);



    }
}
