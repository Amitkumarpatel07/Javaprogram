import java.util.*;
public class Main{
    public static void printSubarrays(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        //int ts = 0;
        for(int i=0; i<numbers.length; i++){
            int start = i;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++){
                    currSum += numbers[k];
                    
                   // System.out.print(numbers[k]+" ");
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
               // ts++;
              //  System.out.println();
            }
            //System.out.println();
        }
        System.out.println("max sum = " +maxSum);
       // System.out.println("total subarrays = " + ts);
    }
    public static void main(String args[]){
        int numbers [] = {2,4,6,8,10};
        maxSubarraySum(numbers);
    }
}
