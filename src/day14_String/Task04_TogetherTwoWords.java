package day14_String;
import java.util.Scanner;
public class Task04_TogetherTwoWords {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter first word:");
        String first = input.next();

        System.out.println("enter second word");
        String second = input.next();

        char firstchar = second.charAt(0);
        char secondlas = first.charAt(second.length()-1);

        if(firstchar==secondlas){
            System.out.println(first+second.substring(1));
        }else {
            System.out.println(first+second);
        }
    }
}
/*
  4. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same,
    print that character once.
                    Input:
                        one
                        eight
                    Output:
                        oneight
 */
