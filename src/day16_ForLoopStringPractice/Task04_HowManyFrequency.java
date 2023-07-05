package day16_ForLoopStringPractice;
public class Task04_HowManyFrequency {
    public static void main(String[] args) {
        String sentence = "python java c java";
        int num = 0;
        for(int i= 0 ; i <= sentence.length()-4; i++){
            String s = sentence.substring(i, i+4);
            if(s.equalsIgnoreCase("java")){
                num+=1;
            }
        }
        System.out.println(num); // 2
    }
}
/*
4. write a program that can return the frequency of the a word Java from the sentence
        Ex:
            sentence = "Java Java";
            output:
                2
            Hint: you need to create
 */