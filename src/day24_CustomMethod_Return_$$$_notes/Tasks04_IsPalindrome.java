package day24_CustomMethod_Return_$$$_notes;
public class Tasks04_IsPalindrome {
    public static void main(String[] args) {
        String str = "Level";
         boolean result = isPalindrome(str);
        System.out.println("result = " + result);
    }
    public static boolean isPalindrome(String str) {
        String str1="";
        for (int i = str.length()-1; i >=0 ; i--) {
            str1+=""+str.charAt(i);
        }
        boolean isPalindrome =str.equalsIgnoreCase(str1);
            return isPalindrome;
    }
}
/*  Tasks--optional:
 4. By using the reverse method above to create another method named
 isPalindrome  that passes a String parameter, the method returns
 true if the string is palindrome, otherwise returns false
				Ex:
					str = "Level"
					isPalindrome(str) ===> true
 */
