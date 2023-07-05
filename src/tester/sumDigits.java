package tester;

public class sumDigits {
    public static void main(String[] args) {

        int number=sumDigits(123);
        System.out.println(number);
    }

    public static int sumDigits(int num){
        int sum=0;
        while (num!=0){
            sum+= num%10;
            num/=10;
        }
        return sum;
    }

}
/*
  write a function that can return the sum of digits of an integer
        Do not use any string manipulations
        Ex:
            input: 123
            output: 6
 */