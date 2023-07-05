package day08_IfStatement;

public class SingleIfStatementIntro {
    public static void main(String[] args) {

        int number = 301;
        boolean evenNumber = number%2 ==0;
        boolean oddNumber = ! evenNumber;
        if(evenNumber){ // even number
            System.out.println(number+ " is even Number");
        }
        if(oddNumber){ //not even number
            System.out.println(number+ " is odd number");
        }
        System.out.println("------------------------------");

        int n= -10;

        if(n>0){  // positive
            System.out.println(n+" is positive");
        }
        if(n<0){ // negative
            System.out.println(n+" is negative");
        }
        if(n==0){
            System.out.println(n+" is zero");
        }






    }
}
