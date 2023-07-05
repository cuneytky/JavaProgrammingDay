package day15_ForLoop;
public class Tasks06_SumOfDigitsString {
    public static void main(String[] args) {
        String input = "A1B2C3";
        int num = 0;
        String chr ="";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch>='0' && ch<='9' ){
                num+=ch-48;
            }else{
                chr+=ch;
            }
        }
        System.out.println("num = " + num);
        System.out.println("chr = " + chr);
    }
}
/*
 6. Write a program that can return the sum of digits from a  string
             Ex:
                 input: A1B2C3
                 output:    6
             Hint: You need to get each of the character by using a loop
	             	To convert char to number:
						             	   '0' - 48   ==> 0
						             	   '1' - 48   ==> 1
 */