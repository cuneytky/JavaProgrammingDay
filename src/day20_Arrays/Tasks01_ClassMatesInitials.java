package day20_Arrays;
import java.util.Arrays;
public class Tasks01_ClassMatesInitials {
    public static void main(String[] args) {

        String[] classMates ={ "Abdul kadir","Burak Yilmaz","Ceyda Kırbas","Cihat Seker","Derya Birsen",
                "Efe Cagrı","Enis Akyol","Erkam Duman","Eyup Kılıc","Fitore Hyseni"};
        String result ="";
        for (int i = 0; i < classMates.length; i++) {
            String each = classMates[i];
            result = each.charAt(0)+"."+each.charAt(each.indexOf(' ')+1);
            System.out.println(result);
        }
    }
}
/*
1. create an array named classmates, and store 10 of your classmates' full names
            print the initials of each classmates in separate lines

 */