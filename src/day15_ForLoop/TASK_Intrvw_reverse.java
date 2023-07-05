package day15_ForLoop;
import java.util.Scanner;
public class TASK_Intrvw_reverse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word:");
        String word = scanner.next();
        String revers ="";
        for (int i=word.length()-1; i>=0 ; i--) {
            revers+= word.charAt(i);
        }
        System.out.println("revers = " + revers);
    }
}
/*
Tasks:	1. Write a program that can reverse any given string
			String str = "Java"; ==> avaJ
 */