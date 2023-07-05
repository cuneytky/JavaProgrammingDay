package day24_CustomMethod_Return_$$$_notes;
import java.util.Arrays;
public class Task04_ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int [] result = reversed(array);
        System.out.println(Arrays.toString(result));
    }
    public static int[] reversed(int[] array) {
        int[] reversed =new int [array.length];
        for (int i = array.length - 1,j=0; i >= 0; j++,i--) {
            reversed[j++]=array[i];
        }
        return reversed;
    }
}
// TASK:   4. create a method that return the reversed array
//					{1,2,3,4,5} === > {5,4,3,2,1}
