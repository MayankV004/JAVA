import java.util.*;
class _01KnapsackTopDown
{
    public static int KnapSack(int []wt , int val[] , int W , int n )
    {
        int [][]t = new int [n+1][W+1];

        for(int i = 0 ; i <= n  ; i++ )
        {
            for(int j = 0 ; j <= W  ; j++)
            {
                if(i == 0 || j == 0)
                {
                    t[i][j] = 0;
                }
                else if( wt[i - 1] <= j )
                {
                    t[i][j] = Math.max(val[i-1] + t[i - 1][j - wt[i - 1]] , t[i - 1][j]);
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][W];
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