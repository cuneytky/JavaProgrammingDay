package day35_Encapsulation.encapsulation;
public class Person {
    private String name;
    private int age;

    public String getName(){  // getter method
        return name;
    }
    public void setName(String name){  // setter method
        this.name = name;
    }
    // önce ismi ve yaşı tanımladık
    // sonra get ile donus sagladık
    // ve set ile cagırdık ve ulastık
    //====================================
    public int getAge(){  // getter method
        return age;
    }
    public void setAge(int age){        // setter method
        if(age <= 0 || age > 150){
            System.err.println("Invalid Age: "+age);
            System.exit(0);
        }
        this.age = age;
    }
}
