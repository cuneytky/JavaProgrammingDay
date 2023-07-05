package day14_String;
import java.util.Scanner;
public class Task03_FirstDeleteWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a word");
        String word = input.next();

        char first = word.charAt(0);
        char last='x';
       if(first==last){
           System.out.println(word.substring(1));
       }else {
           System.out.println(word);
       }
    }
}
/*
    3. Ask user to enter a word. If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
