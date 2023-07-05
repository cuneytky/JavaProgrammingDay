package day24_CustomMethod_Return_$$$_notes;
public class Task03_MinNumArray {
    public static void main(String[] args) {
        int[] array = {10,2,32,4,5,6};
        int result = minNumber(array);
        System.out.println("result = " + result);
    }
    public static int minNumber(int[] array) {
        int minNumber =array[0];
        for (int i = 0; i < array.length; i++) {
            if(minNumber>array[i]){
                minNumber =array[i];
            }
        }
        return minNumber;
    }
}
// TASK:  3. create a method that can return the minimum number from an array of integers
