package day24_CustomMethod_Return_$$$_notes;
public class Warmup_Task05_HowManyDaysMonth {
    public static void main(String[] args) {
        howManyDayMonth(15);
    }
    public static void howManyDayMonth(int month){
        if(month<0 ||month>12){
            System.out.println("invalid");
            return;
        }
        String result ="";
        result= month==2? "28 day-Fabruary": month==3||month==4||month==6||month==9||month==11?
                "30 day":"31 day";
        System.out.println(result);
    }
}
// Breakfast:
//5. Create a method that can print how many days a month has
