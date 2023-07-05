package day24_CustomMethod_Return_$$$_notes;
import java.util.Arrays;
public class Task05_MergeTwoArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5};
        int[] result =  mergedArray(arr1,arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] mergedArray(int[] arr1, int[] arr2) {
        int[] newArray = new int[arr1.length+arr2.length];
        int count=0;
        for (int each : arr1) {
            newArray[count]=each;
            count++;
        }
        for (int each : arr2) {
            newArray[count]=each;
            count++;
        }
        return newArray;
    }
}
/*
5. create a method that can merge two arrays and return the new array
				arr1 = {1,2,3}
				arr2 = {4,5}
				{1,2,3,4,5}
 */
