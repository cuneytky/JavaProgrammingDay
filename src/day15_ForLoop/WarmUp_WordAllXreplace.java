package day15_ForLoop;
import java.util.Scanner;
public class WarmUp_WordAllXreplace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word:");
        String word = scanner.next();

        char ch = word.charAt(0);
        if(ch=='x' || ch=='X'){
            System.out.println(word.replace('x','a'));
        }
        /*
       String str = "xcodeX";
        String result = str.replace("x", "a").replace("X", "a");
        //  "acodeX"                                 "acodea"

        System.out.println(result);
         */





    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */