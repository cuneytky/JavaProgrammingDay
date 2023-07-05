package day36_Inheritance.Task_Sports;

public class SportObject {
    public static void main(String[] args) {

        Baseball baseball=new Baseball();
        baseball.setInfo("Baseball","flexible",9,9,4,180);
        System.out.println(baseball);

        Basketball basketball = new Basketball();
        basketball.setInfo("Basketball","rijit",4,5,3,40);
        System.out.println(basketball);

        AmericanFootball americanFootball = new AmericanFootball();
        americanFootball.setInfo("American Football","flexible",4,15,7,60);
        System.out.println(americanFootball);

        Football football = new Football();
        football.setInfo("Football","rijit",2,11,4,90);
        System.out.println(football);


    }
}
