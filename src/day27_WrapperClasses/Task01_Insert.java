package day27_WrapperClasses;
import java.util.Arrays;
public class Task01_Insert {
    public static void main(String[] args) {

        int[] array = {10, 20, 30, 40, 50};
        int[] result = insert(array,2,100);
        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }
    public static int[] insert(int[] array, int index, int element){
        if(index<0  || index >= array.length){
            System.err.println("Invalid index");
            System.exit(0);
        }
        int[] array1 = new int[array.length+1];
        array1[index]=element;
        for (int i = 0,j=0; i < array.length ; j++,i++) {

            if(i==index){
                j++;
            }
            array1[j]=array[i];
        }
        return array1;
    }
}
/*
1. Insert Task:
		1.1 Create a method named insert that passes three parameters:
		integer array, integer index, integer element. the method inserts
		the given element to the given index of the array and returns the new array
				Ex:
					arr = {10, 20, 30, 40, 50};
					insert(arr, 2, 100) ==> {10, 20, 100, 30, 40, 50}
		1.2 Create the same function for double array, char array and string array
 */
