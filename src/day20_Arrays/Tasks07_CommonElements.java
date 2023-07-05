package day20_Arrays;
import java.util.Arrays;
public class Tasks07_CommonElements {
    public static void main(String[] args) {
        int[] arr1= {1,2,3,4,5};
        int[] arr2= {4,5,6,7,8};
        int[] result = new int[arr1.length];
        int a = arr1[0];
        int b = arr2[0];
        int count =0;
        for (int i = 0 ; i < arr1.length; i++) {
            a = arr1[i];
            for (int i1 = 0; i1 < arr2.length; i1++) {
                b = arr2[i1];
                if(a==b)
                    result[count++] =arr1[i];
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
/*

7. Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}
          output:
              4 5
 */