package day19_LoopPractices;
public class Tasks06_HighestFrequencyChrctr {
    public static void main(String[] args) {
        String str = "abbcccddddeefeeeg";
        int temp =0;
        String max ="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int count =0;
            for (int j=0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);
                if(ch == ch1)
                    count++;
            }
            if(count>temp) {
                temp = count;
                max=""+ch;
            }
        }                // 5                                     e
        System.out.println(temp+ " piece of the highest frequency "+max);
    }
}
/*
6.  Write a program that can find the character that has the highest frequency from a string
 */