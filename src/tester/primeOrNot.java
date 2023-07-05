package tester;
public class primeOrNot {
    public static void main(String[] args) {
        boolean result = prime(17);
        System.out.println("result = " + result);
    }
    public static boolean prime(int num){
        if(num<=1){
            return false;
        }
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
/*
    practice:
this question is a common java interview question.

/
        Write a method that can check if a number is prime or not
     /

/
    Write a method reversing the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
 */

