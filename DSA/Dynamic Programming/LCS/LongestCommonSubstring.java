import java.util.*;

class LongestCommonSubstring
{
    private static int LCSubstring(String a , String b , int n , int m)
    {
        int [][]t = new int[n+1][m+1];
        /*
        Initialization -> First Row -> 0
                          First Column -> 0
        As for a numeric type 2D array default value is 0 . So not Initailising Explicitly  
        */
       int maxLength = 0;
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= m ; j++)
            {
                if(a.charAt(i-1) == b.charAt(j-1))
                {
                    t[i][j] = 1 + t[i-1][j-1];
                    maxLength = Math.max(maxLength , t[i][j] );
                }
                else
                {
                    t[i][j] = 0 ;
                }
            }
        }
        return maxLength;
        
    }
    public static void main(String [] args)
    {
        String a = "abcde";
        String b = "abcdfce";
        int n = a.length(); 
        int m = b.length(); 
        int ans = LCSubstring(a,b,n,m);
        System.out.println("Longest Common Substring is of Length  : " + ans);
    }
}