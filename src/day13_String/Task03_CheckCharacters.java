package day13_String;
import java.util.Scanner;
public class Task03_CheckCharacters {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter word:");
        String word = input.next();

        char wFirst= word.charAt(0);
        char wLast = word.charAt(word.length()-1);
        if(wFirst==wLast){
            System.out.println("same");
        }else{
            System.out.println("different");
        }
    }
}
/*
3. write a program that can check if the first and
   last characters of the string are same
            ex:
                level
            output:
                same
 */
