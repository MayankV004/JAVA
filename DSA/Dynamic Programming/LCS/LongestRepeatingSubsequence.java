import java.util.*;

class LongestRepeatingSubsequence
{
    private static int LRS(String a)
    {
        int n = a.length();

        int [][]t = new int[n+1][n+1];
        /*
        Initialization -> First Row -> 0
                          First Column -> 0
        As for a numeric type 2D array default value is 0 . So not Initailising Explicitly  
        */
        /*
        Concept -> : So Basically we are finding LCS in the same String with a restriction -> i != j
                   : This is because for repeating Character there is always a second index matching to the character.
        */
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n ; j++)
            {
                if(a.charAt(i-1) == a.charAt(j-1) && i != j)
                {
                    t[i][j] = 1 + t[i-1][j-1];
                }
                else
                {
                    t[i][j] = Math.max(t[i][j-1] , t[i-1][j]);
                }
            }
        }
        return t[n][n];
        
    }
    public static void main(String [] args)
    {
        String a = "AABEBCDD";
        int ans = LRS(a);
        System.out.println("Longest Repeating Subsequence is of Length  : " + ans);
    }
}