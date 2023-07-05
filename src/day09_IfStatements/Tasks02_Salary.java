package day09_IfStatements;
public class Tasks02_Salary {
    public static void main(String[] args) {
        double salary = 50_000;
        boolean married = true;
        if(married==true && salary>=130_000){
            System.out.println("The Salary after tax: "+(salary-(salary*0.30)));
        } else if (married==false && salary>=130_000) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.35)));
        } else if (married==true && (salary>=100_000 || salary<=130_000)) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.25)));
        } else if (married==false && (salary>=100_000 || salary<=130_000)) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.30)));
        }else if (married==true && (salary>=80_000 || salary<=100_000)) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.20)));
        } else if (married==false && (salary>=80_000 || salary<=100_000)) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.25)));
        }else if (married==true && salary<=80_000) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.15)));
        } else if (married==false && salary<=80_000) {
            System.out.println("The Salary after tax: "+(salary-(salary*0.20)));
        }
        /*
        --------muhtar's answer--------------------
             double salary = 75_000;
        boolean isMarried = true;

        double taxRate = 0 ;

        if(salary>= 130000 ){ //false: salary < 130000;
            taxRate = 0.35; //35%
        }else if(salary>= 100000 ){ //false: salary < 100000;
            taxRate = 0.30; //30%
        }else if(salary>= 80000 ){ //false: salary < 80000
            taxRate = 0.25; //25%
        }else {
            taxRate = 0.20; //20%
        }


        if (isMarried){ // if the person is married
            taxRate -= 0.05; // subtracting 5% from the original tax rate
        }

        double salaryAfterTax = salary - (salary*taxRate);

        System.out.println("Salary After Tax = " + salaryAfterTax);
         */



    }
}
/*
2. Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                35% for salary of 130K or more++++
      			30% for salary of 100K to 130k (excluded)+++++++
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K
                in addition, if the person is married, he/she will pay 5% less tax
 */