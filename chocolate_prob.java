
import java.util.*;
/*
 * Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 
Each student gets one packet.
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum.
 */
public class chocolate_prob {
    
    public static int choco(int[]arr, int children){
            Arrays.sort(arr);
            int min = Integer.MAX_VALUE;
            for(int i =0;i<arr.length;i++){
                int li = i+children-1;

                if (li>= arr.length)
                break;

                min = Math.min(arr[li]-arr[i],min);
                    

                }

                return min;
            }

            public static void main(String[] args) {
                int arr[]= {1,23,33,26,27,30};
                int res = choco(arr,3);
                System.out.println(res);
                
                    

            }
    }

