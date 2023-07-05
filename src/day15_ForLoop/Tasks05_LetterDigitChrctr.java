package day15_ForLoop;
import java.util.Scanner;
public class Tasks05_LetterDigitChrctr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter digit:");
        String digit = scanner.next();
        String digits ="";
        String letters = "";
        String chrctrs = "";
        for (int i = 0; i < digit.length(); i++) {
            char ch = digit.charAt(i);
            if (ch >= 'a' && ch<='z'){
                letters+=ch;
            } else if (ch>='A'&&ch<='Z') {
                letters+=ch;
            } else if (ch>='0' && ch<='9') {
                digits+=ch;
            }else{
                if(ch!=' '){
                    chrctrs+=ch;
                }
            }
        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("chrctrs = " + chrctrs);
    }
}

/*
 5. write a program that can retive the digits, letters and special characters from a string
            Ex:
                input:
                    mn@#123Ab!
                output:
                    letters: mnAb
                    digits: 123
                    special chars: @#!
 */