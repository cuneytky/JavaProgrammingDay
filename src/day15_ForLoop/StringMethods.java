package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str ="";             // (isBlank kullanirsan false verir)
        boolean r = str.isEmpty();
        System.out.println(r);      // true

       String str1=" "; //"     " (aynı)
       boolean r1 = str1.isBlank();
        System.out.println(r1);  //true (Empty kullanirsan false verir)

        String str2 ="kaya";
        System.out.println(str2.isBlank()); // false because only "  "

        System.out.println("----------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        System.out.println(s1.equals(s2)); // false
        System.out.println(s1.equalsIgnoreCase(s2));  //true
        //Yes, YES, yEs,YEs.... use and no problem
        System.out.println("yEs".equals("Yes")); // false
        System.out.println("yEs".equalsIgnoreCase("Yes")); //true

        System.out.println("----------------------------------------");

        String sentence = "My favorite programing is Java";
        boolean hasCSharp= sentence.contains("C#");
        boolean hasjava= sentence.contains("java");
        boolean hasJava= sentence.contains("Java");
        boolean hasjava2 = sentence.toLowerCase().contains("java");
        boolean hasjava3 = sentence.toUpperCase().contains("JAVA");
        boolean r3 = sentence.contains("java") || sentence.contains("Java");  //jAvA durumunda calismaz

        System.out.println(hasCSharp); // false
        System.out.println(hasjava);   // false
        System.out.println(hasJava);   // true
        System.out.println(hasjava2);  // true
        System.out.println(hasjava3);  // true

        System.out.println("-----------------------------");

        String input1 = "I love jAvA";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java")); // false

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("-----------------------------");

        String a = "Wooden Spoon"; //"wooden spoon"

        boolean x = a.startsWith("Woo");  // true
        boolean x1 = a.startsWith("oo");  // false
        boolean y = a.endsWith("Spoon");  // true
        boolean z = a.toLowerCase().startsWith("wooden");  //true
                // in order to ignore the case sensitivity we first create the
                // lower case/upper case version of string and then compare it
                 // with lowercase/uppercase

        System.out.println(x);
        System.out.println(x1);
        System.out.println(y);
        System.out.println(z);







    }
}
