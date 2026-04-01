package Arrays.Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Arrays1_1{
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(arr[i], i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,8};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(arr, target)));

    }
}