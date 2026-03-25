package Arrays.Leetcode;

public class Arrays2 {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1};  
        Arrays2 obj = new Arrays2(); 
        obj.moveZeroes(arr);        
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}