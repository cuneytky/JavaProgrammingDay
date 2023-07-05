package day16_ForLoopStringPractice;
public class Task05_CatDogContain {
    public static void main(String[] args) {
        String sentence = "dogcaTdogdogGcAtCAT";
        int numC=0;
        int numD=0;
        for (int i = 0; i <=sentence.length()-3 ; i++) {
            String num= sentence.substring(i,i+3);
            if(num.equalsIgnoreCase("cat")){
                numC++;
            }
            if(num.equalsIgnoreCase("dog")){
                numD++;
            }
        }
        boolean result = numC==numD;
        System.out.println("result: "+result);
        System.out.println("cat: "+numC);
        System.out.println("dog: "+numD);
    }
}
/*
5. write a program to print true if the string "cat" and "dog"
appear the same number of times in the given sentence
	        Ex:
	            sentence = "caT dog dogG cAt"
	        output:
	                true
 */