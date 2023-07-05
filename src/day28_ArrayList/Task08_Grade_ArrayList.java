package day28_ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Task08_Grade_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
        ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        for (Integer i: scores) {
            if(i>=90){
                gradeOfA.add(i);
            } else if (i>=80) {
                gradeOfB.add(i);
            } else if (i>=70) {
                gradeOfC.add(i);
            } else if (i>=60) {
                gradeOfC.add(i);
            } else  {
                gradeOfF.add(i);
            }
        }
        System.out.println("gradeOfA = " + gradeOfA + " and total = " + gradeOfA.size());
        System.out.println("gradeOfB = " + gradeOfB + " and total = " + gradeOfB.size());
        System.out.println("gradeOfC = " + gradeOfC + " and total = " + gradeOfC.size());
        System.out.println("gradeOfD = " + gradeOfD + " and total = " + gradeOfD.size());
        System.out.println("gradeOfF = " + gradeOfF + " and total = " + gradeOfF.size());
    }
}
/*
8. Given the following arraylists:
		ArrayList<Integer>  scores = new ArrayList<>();
  		scores.addAll( Arrays.asList(100, 90, 75, 85, 65, 85, 55, 45, 73, 73, 35, 47));
  		ArrayList<Integer> gradeOfA = new ArrayList<>(); // 90 ~ 100
        ArrayList<Integer> gradeOfB = new ArrayList<>(); // 80 ~ 89
        ArrayList<Integer> gradeOfC = new ArrayList<>(); // 70 ~ 79
        ArrayList<Integer> gradeOfD = new ArrayList<>(); // 60 ~ 69
        ArrayList<Integer> gradeOfF = new ArrayList<>(); // 0 ~ 59
        Write a program that can count the total numbers of grade A, B, C, D and F
 */
