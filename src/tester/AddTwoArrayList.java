package tester;
import java.util.Arrays;
public class AddTwoArrayList {

    public static void main(String[] args) {
        int[] arr ={1,2,3,4};
        int[] arr1={6,7,8};
        int[] s= addArray(arr,arr1);
        System.out.println(Arrays.toString(s));
    }
    public static int [] addArray(int[] arr, int[] arr1){

        int[] result = new int[arr.length+ arr1.length];
        int j =0;
        for (int i : arr) {
            result[j++] += i;
        }
        for (int i : arr1) {
            result[j++] += i;
        }
        return result;
    }




}
