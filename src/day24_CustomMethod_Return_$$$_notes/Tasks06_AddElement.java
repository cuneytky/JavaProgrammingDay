package day24_CustomMethod_Return_$$$_notes;
import java.util.Arrays;
public class Tasks06_AddElement {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        int num = 4;
        int[] result = addElement(arr, num);
        System.out.println(Arrays.toString(result));
    }
    public static int[] addElement(int[] arr, int num) {
        int count =0;
        int[] arrNew= new int[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            arrNew[count++]=arr[i];
        }
        arrNew[count++]=num;
        return arrNew;
    }
}
/*  Tasks--optional:
6. create a method named addElement that takes one integer array
 and one integer, the method can add the Integer number after the
  last index of the integer array and returns the new array
    			Ex:
    				arr ={1,2,3};
    				num = 4;
    				addElement(arr, num) ==> {1,2,3,4}
 */
