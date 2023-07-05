package day19_LoopPractices;
public class FrequencyOfChrctr_warm {
    public static void main(String[] args) {
        String str = "aabcccd";
        String temp ="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j=0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);
                if(ch == ch1)
                    count++;
            }
            if(temp.contains(""+ch))
                continue;
            temp+=ch;
            temp+=count;
        }
        System.out.println(temp);

    }
}
/*

Tasks:
	1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1
 */