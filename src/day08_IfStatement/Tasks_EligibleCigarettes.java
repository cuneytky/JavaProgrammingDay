package day08_IfStatement;
public class Tasks_EligibleCigarettes {
    public static void main(String[] args) {
        byte age =20;
        if(age>=18){
            System.out.println("Age is eligible");
        }
        if(age<18){
            System.out.println("Age is not eligible");
        }
    }
}
/*
Tasks:
	1. Given a number (byte) age, write a program
	that can check if the person is eligible to buy Cigarettes
 */
/*
        boolean eligible = age>=18;
        boolean notEligible = !eligible;
 */
