package day09_IfStatements;
public class Task_MultiOption {
    public static void main(String[] args) {
        int not = 60;
        boolean A= not>=90 && not<=100;
        boolean B= not>=80 && not<=89;
        boolean C= not>=70 && not<=79;
        boolean D= not>=60 && not<=69;
        boolean F= not>=0 && not<=59;
        if(A){
            System.out.println("Excellent");
        } else if (B) {
            System.out.println("Great");
        } else if (C) {
            System.out.println("Good");
        } else if (D) {
            System.out.println("Passed");
        } else if (F) {
            System.out.println("Failed");
        }

        System.out.println("--------------------");

        int number= 4; //1-12
        if(number==1){
            System.out.println("January");
        } else if (number==2) {
            System.out.println("February");
        } else if (number==3) {
            System.out.println("March");
        } else if (number==4) {
            System.out.println("April");
        } else if (number==5) {
            System.out.println("May");
        } else if (number==6) {
            System.out.println("June");
        } else if (number==7) {
            System.out.println("July");
        } else if (number==8) {
            System.out.println("August");
        } else if (number==9) {
            System.out.println("September");
        } else if (number==10) {
            System.out.println("October");
        } else if (number==11) {
            System.out.println("November");
        } else if (number==12) {
            System.out.println("December");
        }


    }
}
/*
Task:
	1. garde report ==> A, B, C, D, F
	    90 ~ 100 ==> Excellent
        80 ~ 89 ==> Great
        70 ~ 79 ==> Good
        60 ~ 69 ==> Passed
        0 ~ 59 ==> Failed
	2. name of the month
 */