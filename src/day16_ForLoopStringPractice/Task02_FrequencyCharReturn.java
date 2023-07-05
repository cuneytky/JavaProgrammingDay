package day16_ForLoopStringPractice;
import java.util.Scanner;
public class Task02_FrequencyCharReturn {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter sentence:");
        String str = scanner.nextLine();
        System.out.println("enter a char:");
        String ch = scanner.next();
        int num =0;
        for (int i = 0; i <str.length() ; i++) {
            char k= str.charAt(i);
            if(ch.equals(""+k)){
                num+=1;
            }
        }
        System.out.println(num);
    }
}
/*
2. Write a program that asks user to enter a string and a char, the
        returns the frequency of the char from the given string
            Ex:
                inputs:
                    str = "aabcccd";
                    char = 'c';
                output: 3
                inputs:
                    "Java programming language"
                    'g'
                output: 4
 */