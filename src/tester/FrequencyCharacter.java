package tester;
public class FrequencyCharacter {
    public static void main(String[] args) {

        String write= frequency("AAABBCDD");
        System.out.println(write);

    }
    public static String frequency(String str){
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char ch =str.charAt(i);
            int num=0;
            for (int j = 0; j < str.length(); j++) {
                char ch1 = str.charAt(j);
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
        return result;
    }
}
/*
    Write function that can find the frequency of characters
            Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
  */