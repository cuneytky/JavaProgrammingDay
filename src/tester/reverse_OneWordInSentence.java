package tester;

public class reverse_OneWordInSentence {

    public static void main(String[] args) {
        String str = "I Love Java";
        String result = reverse(str);
        System.out.println(result);

    }

    public static String reverse(String str) { // "Java"
        String reverse = "";
        for (int i = str.lastIndexOf(' ') - 1; i > str.indexOf(' ') ; i--) {
            reverse += str.charAt(i);
        }
        // for full sentence
       str= str.substring(0,str.indexOf(' '))+" "+ reverse+ str.substring(str.lastIndexOf(" "));
        return str;
    }

}
/*
   Write a method reversing the second word ONLY
        Ex:
            Input: I Love Java
            OutPut: I evoL Java
 */