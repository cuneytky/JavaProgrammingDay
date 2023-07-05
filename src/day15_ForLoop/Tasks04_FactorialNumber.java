package day15_ForLoop;
import java.util.Scanner;
public class Tasks04_FactorialNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter anum:");
        int num = scanner.nextInt();
        int multy=1;
        for (int i = 1; i <= num ; i++) {
            multy*=i;
        }
        System.out.println(multy);
        scanner.close();
    }
}
/*	4. Write a program that can return the factorial number of any given number
            Ex:
                input: 5
                output: 120   ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
