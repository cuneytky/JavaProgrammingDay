package day19_LoopPractices;

public class UniqueChrctr_warm {
    public static void main(String[] args) {

        String str = "aabccdeef";
        String Temp="";
        for (int i = 0; i <str.length() ; i++) {
            char ch = str.charAt(i);
            int num =0;
            for (int j = 0; j <str.length() ; j++) {
                char ch1 = str.charAt(j);
                if(ch==ch1){
                    num++;
                }
            }
            if(num==1)
                Temp+=ch;

        }
        System.out.println(Temp);


    }
}
/*
2. Write a program that can find the unique characters from a
string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
               output:
                                bdf
 */