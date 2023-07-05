package day15_ForLoop;
import java.util.Scanner;
public class warmUp_StartWithX {
    public static void main(String[] args) {

        System.out.println("enter a word:");   //Scanner scanner=new Scanner(System.in);
        String word = new Scanner(System.in).next();  // direk Scanner cagirdik

        char ch = word.charAt(0);
        if(ch=='x'){
            word= word.replaceFirst("x","a");
        }
        System.out.println(word);

    }
}
/*
Warmup tasks:
	1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
