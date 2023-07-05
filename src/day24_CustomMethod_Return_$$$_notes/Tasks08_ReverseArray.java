package day24_CustomMethod_Return_$$$_notes;
import java.util.Arrays;
public class Tasks08_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int[] result= reverse(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reverse(int[] arr) {
        int j=0;
        int[] result = new int[arr.length];
        for (int i = arr.length-1; i >=0 ; i--) {
            result[j++]=arr[i];
        }
        return result;
    }
}
/*  Tasks--optional:
8. Create method named reverse that passes an integer array parameter,
 the method can return the reversed array
				Ex:
					arr = {10, 20, 30, 40};
					reverse(arr) ==> {40, 30, 20, 10}
 */
