package day25_CustomMethods_Overloading;
import java.util.Arrays;
public class Task1_MergeArray_Overloading {
    public static void main(String[] args) {
        int[] num1 = {1,2,3};
        int[] num2 = {4,5,6};
        double[] num3= {4.5,7.8,2.4};
        double[] num4= {3.2,4.1,5.6};
        char[] ch1 ={'A','B','C'};
        char[] ch2 ={'D','E','F'};
        String[] str1 = {"wooden","spoon"};
        String[] str2 = {"java","prg"};

        int[] result= mergeArray(num1,num2);
        double[] result1= mergeArray(num3,num4);
        char[] result2 = mergeArray(ch1,ch2);
        String[] result3 = mergeArray(str1,str2);

        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }
    public static int[] mergeArray(int[] num1, int[] num2) {
        int[] numbers = new int[num1.length+ num2.length];
        int count = 0;
        for (int each : num1) {
            numbers[count++] = each;
        }
        for (int each : num2) {
            numbers[count++] =each;
        }
        return numbers;
    }
    public static double[] mergeArray(double[] num3, double[] num4) {
        double[] numbers = new double[num3.length+ num4.length];
        int count = 0;
        for (double each : num3) {
            numbers[count++] = each;
        }
        for (double each : num4) {
            numbers[count++] =each;
        }
        return numbers;
    }
    public static char[] mergeArray(char[] ch1, char[] ch2) {
        char[] numbers = new char[ch1.length+ ch2.length];
        int count = 0;
        for (char each : ch1) {
            numbers[count++]= each;
        }
        for (char each : ch2) {
            numbers[count++]=each;
        }
        return numbers;
    }
    public static String[] mergeArray(String[] str1, String[] str2) {
        int count = 0;
        String[] words = new String[str1.length+ str2.length];
        for (String each : str1) {
            words[count++] = each;
        }
        for (String each : str2) {
            words[count++] = each;
        }
        return words;
    }
}
/*
Task1:
	1. create a method that can merge two integer arrays.
	2. create a method that can merge two double arrays.
	3. create a method that can merge two char arrays.
	4. create a method that can merge two String arrays.
 */
