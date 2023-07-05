package day14_String;
import java.util.Scanner;
public class Task02_WordEnds {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter a word:");
        String word = input.next();

        char k =word.charAt(word.length()-1);
        char l =word.charAt(word.length()-2);

        String last =(""+l+k);
        System.out.println(last);

        if(last.equals("ly")){
            System.out.println("really???");
        }else {
            System.out.println("never mind");
        }
    }
}
/*
 2. ask the user to enter a word. if the word ends with "ly", print "really???" ,
  otherwise, print "never mind"
 */