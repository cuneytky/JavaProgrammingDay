package day10_NestedIf;
public class Tasks04_AgeGroups {
    public static void main(String[] args) {
        int age = 2;
        String result ="";
        if(age>=0&&age<=150){
            if(age>=0 && age<21){
                result="Teenegar";
            } else if (age>=21 && age<55) {
                result="Adult";
            } else if (age>=55) {
                result="Senior";
            }
        }else {
            result="invalid";
        }
        System.out.println(result);
    }
}
/*
4. Create a class called AgeGroups, write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( >= 55 )

             if age is negative or greater than 150, print invalid

             NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */
