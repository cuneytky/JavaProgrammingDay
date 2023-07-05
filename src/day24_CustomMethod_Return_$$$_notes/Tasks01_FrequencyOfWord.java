package day24_CustomMethod_Return_$$$_notes;
public class Tasks01_FrequencyOfWord {
    public static void main(String[] args) {
        String sentence = "Java java java python python";
        String word = "java";
        int result = frequencyOfWord(sentence, word);
        System.out.println(result);
    }
    public static int frequencyOfWord(String sentence, String word){
        int count =0;
        for (int i=0;i<= sentence.length()-4;i++){
            String word1 = sentence.substring(i,i+4);
            if(word1.equalsIgnoreCase(word)){
                count++;
            }
        }
        return count;
    }
}
/*
Tasks--optional:
	1.  create a method named frequencyOfWord that passes two parameters:
	string sentence and String word, then returns the frequency of word
	from the sentence
                Ex:
                    sentence = "Java java java python python"
                    word = "java";
                    frequencyOfWord(sentence, word) ==>  3
 */