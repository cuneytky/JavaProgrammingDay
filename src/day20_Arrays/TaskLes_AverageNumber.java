package day20_Arrays;
import java.util.Arrays;
import java.util.Scanner;
public class TaskLes_AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("how many numbers you want to enter:");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("enter a number:");
            numbers[i]= scanner.nextInt();
        }
        System.out.println("Numbers : "+ Arrays.toString(numbers));
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNum = sum/numbers.length;
        System.out.println("averageNum = " + averageNum);
    }
}
/*
			1. Ask the user how many numbers they want to enter
			2. get all the inputs from the user and store them into an array
			3. Iterate the array & return the average number
 */
