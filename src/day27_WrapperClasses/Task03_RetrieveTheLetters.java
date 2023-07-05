package day27_WrapperClasses;
public class Task03_RetrieveTheLetters {
    public static void main(String[] args) {
        String str = "Wooden Spoon!25";
        String result = retrieve(str);
        System.out.println(result);
    }
    public static String retrieve(String str){
        String letters="";
        String Digits ="";
        String specialChars="";
        for (int i = 0; i <str.length() ; i++) {
            char ch =str.charAt(i);
            if(Character.isLetter(ch) ){
                letters+=""+ch;
            } else if (Character.isDigit(ch)) {
                Digits+=""+ch;
            }else {
                specialChars+=""+ch;
            }
        }
        return "letters \""+letters+"\";\n"+"Digits: \""+Digits+
                "\";\n"+"specialCahrs: \""+specialChars+"\";"; //letters "WoodenSpoon";
                                                                //Digits: "25";
                                                                //specialCahrs: " !";
    }
}
/*
3. Write a program that can retrieve the letters, digits and special
    characters from the string
		Ex:
			str = "Wooden Spoon!"
		output:
			letters= "WoodenSpoon";
			Digits = "";
			specialChars = " !";
 */