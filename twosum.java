import java.util.Arrays;
import java.util.HashMap;

/*
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
Example--
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */

public class twosum {
    
    public static int[] twosum(int []arr, int target){
        HashMap<Integer,Integer> indexes = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            int complement = target - arr[i];
            if( indexes.containsKey(complement)){
                return new int[]{indexes.get(complement),i};
            }
                indexes.put(arr[i],i);
        }
        return new int[]{};
    }

     public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = twosum(arr, target);
        System.out.println("Indexes of the two numbers that add up to the target: " + Arrays.toString(result));
    }
    
}
