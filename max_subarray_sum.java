public class max_subarray_sum {
    
        public static int maxSubArray(int[] nums) {
            int max = nums[0];
            int count = 0;
    
            for(int num : nums){
                count += num;
                max = max < count ? count : max;
                count = count < 0 ? 0 : count;
            }
    
            return max;
        }

        public static void main(String[]args){
            int arr[]= {1,-1,2,3,4,-5,0};
            int ans = maxSubArray(arr);
            System.out.println("Maximum contiguous sum is " + ans);

            
        }
    }
    

