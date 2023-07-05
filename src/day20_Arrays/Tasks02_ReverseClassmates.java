package day20_Arrays;
public class Tasks02_ReverseClassmates {
    public static void main(String[] args) {
        String[] classMates ={ "Abdul kadir","Burak Yilmaz","Ceyda Kırbas","Cihat Seker","Derya Birsen",
                "Efe Cagrı","Enis Akyol","Erkam Duman","Eyup Kılıc","Fitore Hyseni"};
        String result ="";
        for (int i = 0; i < classMates.length; i++) {
            String arr = classMates[i];
            for (int j = arr.length()-1; j >=0; j--) {
                char revers = arr.charAt(j);
                result+= revers;
            }
            result+="\n";
        }
        System.out.println(result);
    }
}
/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}
        		output:
        			avaJ
        			nohtyp
        			#c
 */
