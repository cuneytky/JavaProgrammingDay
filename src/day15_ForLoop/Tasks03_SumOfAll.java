package day15_ForLoop;
import java.util.Scanner;
public class Tasks03_SumOfAll {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a num:");
        int n =scanner.nextInt();
        int sum=0;
        if(n>0){
            for (int i = 1; i <=n ; i++) {
                sum+=i;
            }
            System.out.println(sum);
        }else {
            System.out.println("invalid number");
        }
    }
}
/*  3. write a program that can calculate the sum of all numbers
    between 1 to any given number
            ex:
                input: 100
                output: 5050
 */