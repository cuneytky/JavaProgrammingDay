package day23_CustomMethods_Void;
public class Tasks16_RegularFormatName {
    public static void main(String[] args) {
        regularFormat("cYdeO","sChOOl");
    }
    public static void regularFormat(String name,String lastname){
        name = name.substring(0,1).toUpperCase()+ name.substring(1).toLowerCase();
        lastname= lastname.substring(0,1).toUpperCase()+ lastname.substring(1).toLowerCase();
        System.out.println(name+" "+lastname);
    }
}
/*
16.  write a method that can print out the full name of a person in regular format
           ex:
               fullName("cYdEo", "SCHOOL");
           output:
                    "Cydeo School"
 */
