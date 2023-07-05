package day24_CustomMethod_Return_$$$_notes;
public class Task02_MaxNumArrayList {
    public static void main(String[] args) {
        int[] num = {0,2,1,5,7,4};
        int result = maxNumber(num);
        System.out.println("result = " + result);
    }
    public  static int maxNumber(int[] num){
        int maxNumber=num[0];
        for (int i=0; i< num.length;i++) {
            if( num[i]>maxNumber) {
                maxNumber=num[i];
            }
        }
        return maxNumber;
    }
}
// Task: 2. create a method that can return the maximum number from an array of integers
