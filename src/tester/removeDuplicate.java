package tester;
public class removeDuplicate {
    public static void main(String[] args) {
        String str="AAABBBCCC";
        str=removeDup(str);
        System.out.println(str);
    }
    public static String removeDup(String str){
        String result ="";
        for (int i=0;i<str.length(); i++){
           char ch= str.charAt(i);
           if(result.contains(""+ch)){
               continue;
           }
            result+=ch;
        }
        return result;
    }
}
/*
    Write function that can remove the duplicated values from String
            Ex: removeDup("AAABBBCCC") ==> ABC


     */