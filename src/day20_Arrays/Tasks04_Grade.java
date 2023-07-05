package day20_Arrays;
public class Tasks04_Grade {
    public static void main(String[] args) {
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        char a = 'A';
        for (int i = 0; i < names.length; i++) {
            a= (scores[i]>=90)? 'A':(scores[i]>=80)? 'B':(scores[i]>=70)?'C':(scores[i]>=60)?'D':'F';
            System.out.println(names[i]+"'s score is "+scores[i]+", and grade is "+ a);
        }
    }
}
/*
4. given the following arrays:
		     	String [] names = {"Anna", "Nancy", "Sarah"};
		        int [] scores = {90, 75, 80};
		        char [] grades = new char[names.length];
   1. write a program that can store the grades of the students in the array named grades
   2. print the grade report of each students in separate lines
         	Ex:
         		Anna's score is 90, and grade is A
 */
  /*
            if(scores[i]>=90){
                a = 'A';
            } else if (scores[i]>=80) {
                a = 'B';
            } else if (scores[i]>=70) {
                a = 'C';
            }

             */