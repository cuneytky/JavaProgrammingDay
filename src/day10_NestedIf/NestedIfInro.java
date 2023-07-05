package day10_NestedIf;

public class NestedIfInro {
    public static void main(String[] args) {
        int score = 400;

        if(score>= 0 && score <= 100){ // if score is valid

            if (score >= 60) { // if student passed the exam
                System.out.println("Passed");
            }else { // if the student failed exam
                System.out.println("Failed");
            }


        }else{ //if the score is not valid

            System.out.println("Invalid score");

        }

        System.out.println("-----------------------------------");

        int age = 19;
        boolean hasId = true;

        if(hasId){ // if the person has an ID

            if(age>= 21){ // if the person is 21 years old or older
                System.out.println("Eligible to buy alcohol");
            }else{ // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        }else{ // if the person does not have an ID
            System.out.println("You must have an ID to buy alcohol");
        }
    }
}
