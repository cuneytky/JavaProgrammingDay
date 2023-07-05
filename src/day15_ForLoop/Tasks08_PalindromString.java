package day15_ForLoop;
public class Tasks08_PalindromString {
    public static void main(String[] args) {
        String str ="level";
        String str1 ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1 += str.charAt(i);
        }
        boolean result =str.equalsIgnoreCase(str1);
        System.out.println(result);
    }
}
/*
8. Write a program that can check if the given String is palindrome
			Ex:
				input:
					Level
				output:
					true
				input:
					Anna
				output:
					true
 */