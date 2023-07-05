package day17_While_DoWhile;
public class Task01_DivideWithoutOperators {
    public static void main(String[] args) {

        int num1=50;
        int num2=50;
        int total =0;
        int result=0;
        if(num1>=num2){
            for (int i = num2; i<=num1 ; i++) {
                total+=num2;
                result++;
                if(total>=num1){
                    break;
                }
            }
        }else {
            for (int i = num1; i <= num2; i++) {
                total += num1;
                result++;
                if (total >= num2) {
                    break;
                }
            }
        }
        System.out.println("result = " + result);
    }
}
/*
1. Write a program that can divide two positive numbers without
using / (division) and * (multiplication) operators.
 */