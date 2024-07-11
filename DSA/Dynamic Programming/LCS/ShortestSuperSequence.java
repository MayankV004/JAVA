import java.util.*;

class ShortestSuperSequence
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
    private static int ShortestSupersequence(String a , String b , int n , int m)
    {
        /*
        For Length Shortest Super Sequence , 
        -> We need to find the Longest common Subsequenceof the two strings first 
        -> Then We need to add the lengths of the two strings and minus the length of LCS as it is common in both the strings.
        Eg. a: "AGGTAB" -> length = 6
            b: "GXTXAYB" -> length = 7
            ---------------------------
                            Total = 13
            ---------------------------

            Now LCS of Strings is "GTAB" -> length = 4 

            Therefore , SCS -> 13 - 4 = 9.
        */ 
        return (m + n) - LCS(a,b,n,m);
    }
    public static void main(String [] args)
    {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int n = a.length(); 
        int m = b.length(); 
        int ans = ShortestSupersequence(a,b,n,m);
        System.out.println("Shortest SuperSequence is of Length  : " + ans);
    }
}