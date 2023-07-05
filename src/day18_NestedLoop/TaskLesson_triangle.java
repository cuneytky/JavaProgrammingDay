package day18_NestedLoop;
public class TaskLesson_triangle {
    public static void main(String[] args) {
        String s="";
        int num =0;
        for (int i = 0; i <10 ; i++) {  //0

            for (int j = 0; j <=num ; j++) {
                s+="* ";
                System.out.println(s);
            }
        }
    }
}
/*
lunch Task:
Use a nested loop to print the following shape
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
        * * * * * * *
        * * * * * * * *
        * * * * * * * * *
        * * * * * * * * * *
 */