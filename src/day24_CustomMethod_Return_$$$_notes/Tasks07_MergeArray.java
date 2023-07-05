package day24_CustomMethod_Return_$$$_notes;
import java.util.Arrays;
public class Tasks07_MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        int[] result = merge(arr1, arr2);
        System.out.println(Arrays.toString(result));
    }
    public static int[] merge(int[] arr1, int[] arr2) {
        int count =0;
        int[] arrNew = new int[arr1.length+ arr2.length];
        for (int i=0; i< arr1.length;i++) {
            arrNew[count++]=arr1[i];
        }
        for (int i=0; i<=arr2.length-1;i++) {
            arrNew[count++]=arr2[i];
        }
        return arrNew;
    }
}
/*  Tasks--optional:
7. Create a method named merge that passes two integer array parameters,
 the method can merge two integer arrays and return the new array
				Ex:
					arr1 = {1,2,3}
					arr2 = {4,5,6}
					merge(arr1, arr2) ====> {1,2,3,4,5,6}
 */
