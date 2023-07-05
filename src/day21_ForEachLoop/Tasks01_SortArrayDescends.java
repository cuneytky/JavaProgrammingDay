package day21_ForEachLoop;
import java.util.Arrays;
public class Tasks01_SortArrayDescends {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,45,78,3,90};
        int[] newArr = new int[arr.length];
        Arrays.sort(arr);
        for (int i = arr.length - 1,j=0 ; i >= 0; i--, j++) {
            newArr[j] = arr[i];
        }
        System.out.println(Arrays.toString(newArr));//[90, 78, 45, 9, 7, 5, 4, 3, 1]
    }
}
/*
 1. Write a program that sort the array of integer in descending order
 */