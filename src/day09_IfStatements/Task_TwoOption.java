package day09_IfStatements;
public class Task_TwoOption {
    public static void main(String[] args) {
        int n1 = 60,
                n2=50;
        boolean maxNumber = n1>n2;
        if(maxNumber){
            System.out.println(n1+" is bigger than "+n2);
        }else{
            System.out.println(n2+" is bigger than "+n1);
        }
        System.out.println("---------------------------");

        int n3 = 10,
                n4=20;
        boolean minNumber = n3<n4;
        if(minNumber){
            System.out.println(n3+" is smaller than "+n4);
        }else{
            System.out.println(n4+" is smaller than "+n3);
        }

        System.out.println("---------------------------");

        int age =17;
        boolean isEligible = age>=18;
        if(isEligible){
            System.out.println("Eligible(alcohol");
        }else{
            System.out.println("Not Eligible(alcohol");
        }

        System.out.println("----------------------------");

        int ageVote =22;
        boolean isEligibleVote= ageVote>=21;
        if(isEligibleVote){
            System.out.println("Eligible(vote)");
        }else{
            System.out.println("Not Eligible (vote)");
        }
    }
}
/*
task:
		1. Maximum number between two different numbers
		2. Minimum number between two different numbers
		3. Write a program that can check if the person is eligible to buy alcohol
		4. Write a program that can check if the person is eligible to vote
 */