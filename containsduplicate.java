import java.util.*;

/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
 * 
 * 
 */

public class containsduplicate {
    public static boolean duplicates(int nums[]){
        HashSet<Integer> dupi = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            if(dupi.contains(nums[i])){
                return true;
            }
            dupi.add(nums[i]);
        }
        return false;
    }

   
        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
            boolean result = containsduplicate.duplicates(nums);
            System.out.println("Contains duplicates: " + result);
        }
    }
    

