package day27_WrapperClasses;
import java.util.Arrays;
public class Task02_SwapTask {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        int[] result =swap(array,2,4);
        System.out.println("result = " + Arrays.toString(result));
    }
    public static int[] swap(int[] array,int i, int j){
        if((i<0||i>= array.length)||(j<0||j>= array.length)){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] result =new int[array.length];
        for (int i1 = 0,k=0; i1 < array.length; k++, i1++) {
            result[k]=array[i1];
            result[i]=array[j];
            result[j]=array[i];
        }
        return result;
    }
}
/*
2. Swap Task:
	2.1 Create a method named swap that passes three parameters: integer array,
	 integer i, integer j. the method swaps the element at index i with
	 the element at index j, and returns the new array
			Ex:
				arr = {10, 20, 30, 40, 50};
				swap(arr, 2, 4) ==>  {10, 20, 50, 40, 30}
	2.2 Create the same function for double array, char array and string array
 */