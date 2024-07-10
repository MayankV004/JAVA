import java.util.*;
class _01Knapsack
{
    public static int KnapSack(int wt[] , int val[] , int W , int n)
    {
        // Base Condition
        if(n == 0 || W == 0)
        {
            return 0;
        }
        /* Return the maximum of two cases:
         (1) nth item included
         (2) not included
        */
        if(wt[n-1] <= W)
        {
            return Math.max(val[n-1] + KnapSack(wt , val , W - wt[n-1] , n - 1) , KnapSack(wt , val , W , n - 1));
        }
        
        /* If weight of the nth item is
         more than Knapsack capacity W,
         then this item cannot be included
         in the optimal solution
        */

        else    // if(wt[n-1] > W)
        {
            return KnapSack(wt , val , W , n - 1);
        }


    }
    public static void main(String [] args)
    {
        int []wt  = {10, 20, 30};
        int []val = { 60, 100, 120};
        int W = 50;
        int n = wt.length;
        int ans = KnapSack(wt , val , W , n);
        System.out.println("Your MAX profit is : "+ans);
    }
}