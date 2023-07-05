package day08_IfStatement;
public class Tasks_GradeLevel {
    public static void main(String[] args) {
        byte number = 11;
        if(number>=1 && number<=5){
            System.out.println("Elementary school");
        }
        if(number>=6 && number<=8){
            System.out.println("Middle school");
        }
        if(number>=9 && number<=12){
            System.out.println("High school");
        }
        if(number>=13 && number<=16){
            System.out.println("College");
        }
        if(number>=17 && number<=18){
            System.out.println("Grad school");
        }
    }
}
/*
Tasks- 2.  Given a number(byte) grade level determine and print which school
           type someone is in.grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
        	Assume that the given number is 1 ~ 18
 */
/*
        boolean level1= number>=1 && number<=5;
        boolean level2= number>=6 && number<=8;
        boolean level3= number>=9 && number<=12;
        boolean level4= number>=13 && number<=16;
        boolean level5= number>=17 && number<=18;
 */