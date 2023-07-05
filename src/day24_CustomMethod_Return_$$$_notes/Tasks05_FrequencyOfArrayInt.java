package day24_CustomMethod_Return_$$$_notes;
public class Tasks05_FrequencyOfArrayInt {
    public static void main(String[] args) {
        int[] array ={1,1,1,1,1,2,2};
        int num =1;
        int result = frequency (array, num);
        System.out.println("result = " + result);
    }
    public static int frequency(int[] array, int num) {
        int count =0;
        for (int i = 0; i < array.length; i++) {
            if(num==array[i]){
                count++;
            }
        }
        return count;
    }
}
/*  Tasks--optional:
  5. create method that accepts one integer array and one
  integer number and returns the frequency of the number
                    Ex:
                        int[] array ={1,1,1,1,1,2,2};
                        frequency(array, 1) ==> 5
 */
