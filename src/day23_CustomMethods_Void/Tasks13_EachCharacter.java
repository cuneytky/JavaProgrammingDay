package day23_CustomMethods_Void;
public class Tasks13_EachCharacter {
    public static void main(String[] args) {
        printEachChar("wooden");
    }
    public static void printEachChar(String str){
        for (int i =0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+" ");
        }
    }
}
// 13. create a method named printEachChar that can print each characters of a string
