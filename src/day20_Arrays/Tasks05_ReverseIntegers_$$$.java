package day20_Arrays;
import java.util.Arrays;
public class Tasks05_ReverseIntegers_$$$ {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        int[] rev = new int[num.length];
        int count =0;
        for (int i = num.length - 1; i >= 0; i--) {
             rev [count++]= num[i];
        }
        System.out.println(Arrays.toString(num)); //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(rev)); //[5, 4, 3, 2, 1]
    }
}
/*
  5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};
        output:
            reversedArray = {5,4,3,2,1};
 */