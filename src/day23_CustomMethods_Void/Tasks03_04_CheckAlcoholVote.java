package day23_CustomMethods_Void;
public class Tasks03_04_CheckAlcoholVote {
    public static void main(String[] args) {
        eligibleToBuyAlcohol(19);
        eligibleToVote(19,"USA");
    }
    public static void eligibleToBuyAlcohol(int age){
        if(age>=19){
            System.out.println("You are eligible");
        }else{
            System.out.println("You are not eligible");
        }
    }
    public static void eligibleToVote(int age, String citizen){
        if(age>=19 && citizen.equalsIgnoreCase("USA")){
            System.out.println("You are eligible: "+age+", \""+citizen+"\"");
        }else {
            System.out.println("You are not eligible to vote!");
        }
    }
}
/*
3. create a method that can check if a person is eligible to buy alcohol
4. create a method that can check if a person is eligible to vote
			Ex:				eligibleToVote(19, "USA");
			output:			You are not eligible to vote!
 */