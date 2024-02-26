public class NOzeroInteger {


    /*
 * No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.
Given an integer n, return a list of two integers [a, b] where:
a and b are No-Zero integers.
a + b = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.
Example 1:
Input: n = 2
Output: [1,1]
Explanation: Let a = 1 and b = 1.
Both a and b are no-zero integers, and a + b = 2 = n.
     */
    public static boolean see(int a){
        while(a>0){
            int d = a%10;
            if(d==0){
                return false;
            }
            a/=10;
        }
        return true;
    }
    public int[] getNoZeroIntegers(int n) {
        int[]res = new int[2];

        for(int i =1;i<n;i++){
            int c= n-i;
            if(see(c) && see(i)){
                res[0]=i;
                res[1]=c;
                return res;
            }
        }
    return res;
        
    }
    
}
