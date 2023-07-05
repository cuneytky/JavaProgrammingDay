package day18_NestedLoop;
public class Task04_FrequencyChracters {
    public static void main(String[] args) {
        String str="aabcccddeef";
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            char ch= str.charAt(i);
            int num=0;

            for (int j = 0; j < str.length(); j++) {
               char ch1= str.charAt(j);
               if(ch==ch1){
                   num++;
               }
            }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;
            result+=num;
        }
        System.out.println(result); //a2b1c3d2e2f1
    }
}
/*
4. Write a program that can find the frequency of the characters from a string
			 Ex:           str = "aabcccd";
                        output:
                                a2b1c3d1
    Hint: if you find out how to find the frequency of one character,
    then repeat it for all the remaining characters
 */