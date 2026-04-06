package Arrays.Leetcode;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum_MethodOne(int[] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static int[] twoSum_MethodTwo(int[] arr, int target){
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
        int[] arr = {2,11,7,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum_MethodOne(arr,target)));

        System.out.println(Arrays.toString(twoSum_MethodTwo(arr, target)));
    }
}
