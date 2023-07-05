package day19_LoopPractices;
public class TaskLes02_ReturnIndexFirstDuplicate {
    public static void main(String[] args) {
        String str = "abcccddee";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
                if (ch==ch1){
                    count++;
                }
            }
            if(count==2){
                System.out.println(str.indexOf(ch)); //5
                break;
            }
        }
    }
}
/*
Tasks:
	2. Write a program that cna return the index number of the first duplicated character from a string
 */