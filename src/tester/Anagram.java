package tester;

import java.util.Arrays;
/*
  Write a  function that check if a string is build out of the same letters as another string.
          Ex: same("abc", "cab"); -> true , Solution 1:
              same("abc", "abb"); -> false:

Note: An anagram is a word or phrase formed by rearranging the letters of another word or phrase,
using all the original letters exactly once. For example, the word "listen" can be rearranged to
form the word "silent", so "silent" is an anagram of "list
   */
public class Anagram {
    public static void main(String[] args) {
        String str="abc";
        String str2="cab";
       char[] ch= str.toCharArray();
       char[] ch1=str2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch1);
        boolean isAnagram=Arrays.equals(ch,ch1);
        System.out.println(isAnagram);
    }
}

/*  ................ hikmet solution......
public static void main(String[] args) {
        String a="abc";
        String b="cab";
        System.out.println(same(a,b));
    }
    // solution 1:
    public static boolean same(String a, String b) {
        // If the strings are different lengths, they can't be composed of the same letters
        if (a.length() != b.length()) {
            return false;
        }

        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        String a1 = "", a2 = "";

        for (char each : ch1) {
            a1 += each;
        }

        for (char each : ch2) {
            a2 += each;
        }

        return a1.equals(a2);
    }
 */


