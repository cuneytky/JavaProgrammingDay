package day25_CustomMethods_Overloading;

public class SumOfNumbers_WarmupTask1 {

    public static void main(String[] args) {

        int num1=3;
        int num2=5;
        int num3=7;
        int num4=8;

        int result = sumOf2Numbers(num1,num2);
        System.out.println("result = " + result);

        int result2 = sumOf3Numbers(num1,num2,num3);
        System.out.println("result2 = " + result2);

        int result3 = sumOf4Numbers(num1,num2,num3,num4);
        System.out.println("result3 = " + result3);


    }

    public static int sumOf4Numbers(int num1, int num2, int num3, int num4) {
        int total =num1+ num2+num3 +num4;
        return total;
    }

    public static int sumOf3Numbers(int num1, int num2, int num3) {
        int total =num1+ num2+num3;
        return total;
    }

    public static int sumOf2Numbers(int num1, int num2) {
        int total =num1+ num2;
        return total;
    }

}
/*
Warmup tasks:
	Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers
 */