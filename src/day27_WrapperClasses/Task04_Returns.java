package day27_WrapperClasses;
public class Task04_Returns {
    public static void main(String[] args) {
        String str = "JAVAA javal";
        boolean result = equalsUpperToLower(str);
        System.out.println("result = " + result);
    }
    private static boolean equalsUpperToLower(String str) {
        boolean result=false;
        int k=0;
        int l=0;
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                k++;
            } else if (Character.isLowerCase(ch)) {
                l++;
            }
        }
        if(k==l){
            result =true;
        }
        return result;
    }
}
/*
4. Write program that returns true if the total number of upper case
characters are equal to total number of Lowercase characters of a string
		Ex:
			str = "JAVA java";
		output:
			true
 */
