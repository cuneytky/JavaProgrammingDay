package tester;

import java.util.Arrays;

public class fibonacci {

    public static void main(String[] args) {
        int[] fib = fibonacci(7);
        System.out.println(Arrays.toString(fib));
    }


    public static int[] fibonacci(int size) {
        int[] arr = new int[size];
        if (size >= 1) {
            arr[0] = 1;
        }
        for (int i = 1; i < size; i++) {
            arr[i] = i < 2 ? i : arr[i - 2] + arr[i - 1];
        }
        return arr;
    }
    /*
    public static int[] fibonacci(int size){
        int[] arr = new int[size+1];
        arr[0]=0;
        arr[1]=1;
        for (int i = 2; i <=size ; i++) {
            arr[i]=arr[i-2]+ arr[i-1];
        }

        int[] result = new int[size];
        int j=0;
        for (int i = 0; i <=size ; i++) {
            if(i==0){
                continue;
            }
            result[j++]=arr[i];
        }
        return result;
    }
*/





}
    /*

    practice:
/*Write a method that can return an "int []" array of fibonacci numbers whose size is fixed by the given parameter.
For ex:
int size=7;
print--> array
method name: fibonacci
output: fibonacci = [1, 1, 2, 3, 5, 8, 13]
* /

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
