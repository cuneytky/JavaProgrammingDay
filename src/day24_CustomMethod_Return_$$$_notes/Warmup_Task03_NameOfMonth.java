package day24_CustomMethod_Return_$$$_notes;
public class Warmup_Task03_NameOfMonth {
    public static void main(String[] args) {
        nameOfMonth(1);
    }
    public static void nameOfMonth(int month){
        String monthName ="";
        if(month>=1 && month<=12){
            monthName = month==1 ? "January": month==2 ? "February":
                         month==3 ? "March": month==4 ? "April":
                         month==5 ? "May": month==6 ? "June":
                         month==7 ? "July": month==8 ? "August":
                         month==9 ? "September": month==10 ? "October":
                          month==11 ? "November":  "December";
        }else {
            monthName= "invalid number";
        }
        System.out.println("monthName = " + monthName);
    }
}
// 3. Create a method that can display the name of the month
//     based on the given number to the method