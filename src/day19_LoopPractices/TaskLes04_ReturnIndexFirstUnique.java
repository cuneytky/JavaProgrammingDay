package day19_LoopPractices;
public class TaskLes04_ReturnIndexFirstUnique {
    public static void main(String[] args) {
        String str = "aabbcddefg";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count = 0;
            for (int j = 0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);
                if(ch == ch1){
                    count++;
                }
            }
            if(count==1){
                System.out.println(str.indexOf(ch));//4
                break;
            }
        }
    }
}
/*
Tasks:
	4. Write a program that can return the index number of the first unique character.
 */