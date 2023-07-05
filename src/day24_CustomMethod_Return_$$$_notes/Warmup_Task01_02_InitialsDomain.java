package day24_CustomMethod_Return_$$$_notes;

public class Warmup_Task01_02_InitialsDomain {
    public static void main(String[] args) {
        initialsPerson("cuneyt","kaya");
        System.out.println("----------------------------");
        domainOfEmail("kaya@gmail.com");
        System.out.println("----------------------------");
        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domainOfEmail(email);
        }

        System.out.println("-----------------------------");
    }


    public static void initialsPerson(String name,String lastname){
        /*
        name=name.substring(0,1);
        lastname = lastname.substring((lastname.indexOf(" ")+1),(lastname.indexOf(" ")+2));
        System.out.println(name+" "+lastname);

         */
        String initials = name.charAt(0)+"."+lastname.charAt(0);
        initials= initials.toUpperCase();
        System.out.println("initials = " + initials);
    }

    public static void domainOfEmail(String email){  // Cydeo.School@gmail.com
        /*
        email = email.substring(email.indexOf("@")+1);
        System.out.println("Email domain: "+email);*/
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }




}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person
	2. Create a method that can display the domain of the email
 */