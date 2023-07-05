package day19_LoopPractices;
public class TaskLes03_DisplayTwice {
    public static void main(String[] args) {
        String str ="abbccddeefg";
        String temp ="";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);
                if( ch==ch1){
                    count++;
                }
            }
            if( count==2){
                temp += ch;
            }
        }
        System.out.println(temp);
    }
}
/*
Tasks:
	3. Write a program that can display all the characters that appeared twice in the string.
 */