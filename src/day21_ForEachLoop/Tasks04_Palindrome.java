package day21_ForEachLoop;
import java.util.Arrays;
public class Tasks04_Palindrome {
    public static void main(String[] args) {
       String[] pol = {"anna", "level", "Java"};
        int count =0;
        for (String each:pol) {
            String revEach ="";
            for (int i = each.length()-1; i >=0 ; i--) {
                revEach+=each.charAt(i);
                if(each.equalsIgnoreCase(revEach))
                    count++;
            }
        }
        System.out.println(count); //2
    }
}
/*
  4. write a program that can count how many palindromes in an array of string
        Ex:
            {"anna", "level", "Java"};
            output:
                2
 */