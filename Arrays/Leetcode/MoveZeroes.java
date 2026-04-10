package Arrays.Leetcode;
import java.util.*;

public class MoveZeroes{
    public static void moveZeroes(int[] arr){
        int left = 0;
        for(int right = 0; right < arr.length; right++){
            if(arr[right] != 0){
                arr[left] = arr[right];
                left++;
            }
        }
        for(int i = left; i< arr.length; i++){
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,3,12};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}