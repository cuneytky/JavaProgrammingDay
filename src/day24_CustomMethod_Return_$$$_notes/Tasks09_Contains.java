package day24_CustomMethod_Return_$$$_notes;
public class Tasks09_Contains {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int num =10;
        boolean result = contains(arr, num);
        System.out.println("result = " + result); // false
    }
    public static boolean contains(int[] arr, int num) {
        boolean result =false;
        for (int each : arr) {
            if(each==num){
                result =true;
            }
        }
        return result;
    }
}
/*   Tasks--optional:
9. Create a method named contains that passes one integer array
 and one integer parameters, the method returns true if the given
  integer is contained in the given array, otherwise returns false

				Ex:
					arr = {1,2,3,4,5,6,7};
					num = 10;

					contains(arr, num) ===> false
 */
