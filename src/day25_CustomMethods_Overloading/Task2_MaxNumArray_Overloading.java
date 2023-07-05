package day25_CustomMethods_Overloading;
import java.util.Arrays;
public class Task2_MaxNumArray_Overloading {
    public static void main(String[] args) {
        int[] num1 = {83145,85978,999999}; //-2,147,483,648 to 2,147,483,647
        double[] num2= {4.12345678,5.12345678,8.123456789};   //15 decimal digits
        long[] num3 = {12345678910L,12345678911L,12345678912L}; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        short[] num4 = {205,451,698}; //-32,768 to 32,767
        float[] num5 = {4.1234567f,7.8f,2.4f,9.4f}; //6 to 7 decimal digits
        byte[] num6 = {41,56,89};  //-128 to 127

        int result1= maxNumber(num1);
        System.out.println(result1);
        double result2= maxNumber(num2);
        System.out.println(result2);
        long result3= maxNumber(num3);
        System.out.println(result3);
        short result4= maxNumber(num4);
        System.out.println(result4);
        float result5= maxNumber(num5);
        System.out.println(result5);
        byte result6= maxNumber(num6);
        System.out.println(result6);
    }
    public static int maxNumber(int[] num1) {
        Arrays.sort(num1);
        return num1[num1.length-1];
        /*
        int max= num1[0];
        for (int i = 0; i <num1.length ; i++) {
            if(num1[i]>max){
                max = num1[i];
            }
        }
        return max;
         */
    }
    public static double maxNumber(double[] num2) {
        Arrays.sort(num2);
        return num2[num2.length-1];
    }
    public static long maxNumber(long[] num3) {
        Arrays.sort(num3);
        return num3[num3.length-1];
    }
    public static short maxNumber(short[] num4) {
        Arrays.sort(num4);
        return num4[num4.length-1];
    }
    public static float maxNumber(float[] num5) {
        Arrays.sort(num5);
        return num5[num5.length-1];
    }
    public static byte maxNumber(byte[] num6) {
        Arrays.sort(num6);
        return num6[num6.length-1];
    }
}
/*
Task 2:
	1. create a method that can return the max number from an integer array
	2. create a method that can return the max number from double array
	3. create a method that can return the max number from long array
	4. create a method that can return the max number from short array
	5. create a method that can return the max number from float array
	6. create a method that can return the max number from byte array
 */