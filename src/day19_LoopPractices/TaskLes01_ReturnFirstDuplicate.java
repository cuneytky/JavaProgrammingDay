package day19_LoopPractices;
public class TaskLes01_ReturnFirstDuplicate {
    public static void main(String[] args) {
        String str = "abbcccdddd";
        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            int count =0;
            for (int j = 0; j <str.length()-1 ; j++) {
                char ch1= str.charAt(j);
                if(ch==ch1){
                    count++;
                }
            }
            if(count==2){
                System.out.println(ch);  //b
                break;
            }
        }
    }
}
/*
Tasks:
	1. Write a program that can return the first duplicated character from a string
 */