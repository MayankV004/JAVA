import java.util.*;

class LongestCommonSubsequence
{
    private static int LCS(String a , String b , int n , int m)
    {
        int [][]t = new int[n+1][m+1];
        /*
        Initialization -> First Row -> 0
                          First Column -> 0
        As for a numeric type 2D array default value is 0 . So not Initailising Explicitly  
        */
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= m ; j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i][j-1] , t[i-1][j]);
                }
            }
        }
        return t[n][m];
        
    }
    public static void main(String [] args)
    {
        String a = "acbcf";
        String b = "abcfad";
        int n = a.length(); 
        int m = b.length(); 
        int ans = LCS(a,b,n,m);
        System.out.println("Longest Common Subsequence is of Length  : " + ans);
    }
}