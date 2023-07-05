package day22_MultiDimensionalArray;
import java.util.Arrays;
public class Tasks01_Reverse2DArray {
    public static void main(String[] args) {

        int[][] arr2D={ {1,2,3}, {4,5,6}};
        int[][] result = new int[arr2D.length][];

        for (int i = arr2D.length - 1; i >= 0; i--) {
            int temp[] =new int[arr2D[i].length];
            int num =0;
            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                temp[num++]=arr2D[i][i1];
            }
            result[(arr2D.length - 1)-i]=temp;
        }
        System.out.println(Arrays.deepToString(result)); //[[6, 5, 4], [3, 2, 1]]
    }
}
/*
1. Write a program that can reverse a two dimensional array (return new array)
		Ex:
			array = { {1,2,3}, {4,5,6}};
		output:
			reverse = { {6,5,4}, {3,2,1},};
 */