package day21_ForEachLoop;
public class Tasks02_EvenOrOdd {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,45,78,3,90};
        int odd =0;
        int even =0;
        for (int each : arr) {
            if(each %2==0){
                even++;
            }
            if(each %2==1){
                odd++;
            }
        }
        System.out.println("odd numbers: "+odd);
        System.out.println("even numbers: "+even);
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
 */