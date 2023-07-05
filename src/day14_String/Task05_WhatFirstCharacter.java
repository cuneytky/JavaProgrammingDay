package day14_String;
import java.util.Scanner;
public class Task05_WhatFirstCharacter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter a word");
        String word = input.next();

        char ch = word.charAt(0);
        if(ch>=65 && ch<=90){
            System.out.println("first character is uppercase letter");
        } else if (ch>=97 && ch<=122) {
            System.out.println("first character is lowercase letter");
        }else {
            System.out.println("first character is digit");
        }
    }
}
/*
   5. Ask user to enter a word,
        if the word starts with digits, print "first character is digit"
        if the word starts with uppercase letters, print "first character is lowercase letter"
        if the word starts with lowercase letters, print "first character is uppercase letter"
        if the word starts with special characters, print "first character is special character"
    HINT: 1. you need charAt() method
              2. Ascii Table
 */
