package day09_IfStatements;
public class Task01_NumberToWord {
    public static void main(String[] args) {
        int number = 5;
        if(number==0){
            System.out.println("Zero");
        } else if (number==1) {
            System.out.println("One");
        } else if (number==2) {
            System.out.println("Two");
        } else if (number==3) {
            System.out.println("Three");
        } else if (number==4) {
            System.out.println("Four");
        } else if (number==5) {
            System.out.println("Five");
        } else if (number==6) {
            System.out.println("Six");
        } else if (number==7) {
            System.out.println("Seven");
        } else if (number==8) {
            System.out.println("Nine");
        }else {
            System.out.println("Invalid");
        }
    }
}
/*
1. Create a class called NumberToWord, and write a java program
    that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;
			output:
				One
 */
