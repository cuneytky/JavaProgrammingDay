package day25_CustomMethods_Overloading;
import java.util.Arrays;
public class Task4_ReverseArray_Overloading {
    public static void main(String[] args) {
        int[] arr1 = {4,5,6,7};
        int[] result = reverse(arr1);
        System.out.println(Arrays.toString(result));

        double[] num2= {4.1,5.1,8.1};
        double[] result1 = reverse(num2);
        System.out.println(Arrays.toString(result1));

        char[] ch = {'a','b','c'};
        char[] result2 = reverse(ch);
        System.out.println(Arrays.toString(result2));

        String[] str = {"java","prg","lab"};
        String[] result3 = reverse(str);
        System.out.println(Arrays.toString(result3));
    }
    public static int[] reverse(int[] arr1){
        int[] result = new int[arr1.length];
        int j=0;
        for (int i = arr1.length - 1; i >= 0; i--) {
            result[j++] = arr1[i];
        }
        return result;
    }
    public static double[] reverse(double[] num2){
        double[] result1 = new double[num2.length];
        int j=0;
        for (int i = num2.length - 1; i >= 0; i--) {
            result1[j++] = num2[i];
        }
        return result1;
    }
    public static char[] reverse(char[] ch){
        char[] result2 = new char[ch.length];
        int j=0;
        for (int i = ch.length - 1; i >= 0; i--) {
            result2[j++] = ch[i];
        }
        return result2;
    }
    public static String[] reverse(String[] str){
        String[] result3 = new String[str.length];
        int j=0;
        for (int i = str.length - 1; i >= 0; i--) {
            result3[j++]=str[i];
        }
        return result3;
    }
}
/*
Task 4:
	1. Create a method that can reverse an integer array
	2. Create a method that can reverse a double array
	3. Create a method that can reverse a char array
	4. Create a method that can reverse a String array
 */
