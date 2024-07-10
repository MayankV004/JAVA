import java.util.*;

class RodCutting
{
    public static int RodCuttingMaxProfit(int[] price , int N)
    {
        int len[] = new int[N];
        for(int i = 0 ; i < N ; i++)
        {
            len[i] = i+1;
        }
        int [][] t = new int[N+1][len.length + 1]; 
        // initialisation -> 1st row and column both with zero -> as 0 is default value so we are not explicitly 
        //                   initialising it.
        /*
        Unbounded KnapSack -> We can take multiple Occurences of same Element in the answer.

        In this problem we have to maximise the profit for rod cutting 
        
        -> Basically what we are doing here is 0-1 knapSack but taking Multiple occurence.
        -> here ,  value[] -> price[] and W (capacity) -> N . Thats it.
        
        */
        for(int i = 1 ; i <= N ; i++)
        {
            for(int j = 1 ; j <= len.length ; j++)
            {
                if(len[i-1] <= j)
                {
                    t[i][j] = Math.max(price[i-1] + t[i][j - len[i-1]] , t[i-1][j]);
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[N][len.length];
    }
    public static void main(String[] args)
    {
        int []price = {1 , 5 , 8 , 9 , 10 , 17 , 17 , 20};
        int length = 8;
        int ans = RodCuttingMaxProfit(price , length);
        System.out.println("Max Profit in Rod Cutting  : "+ ans);
    }
}