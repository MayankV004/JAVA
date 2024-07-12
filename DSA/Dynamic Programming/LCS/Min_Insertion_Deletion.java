import java.util.*;

class Min_Insertion_Deletion
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
    private static void Minimum_Number_Of_Insertion_Deletion(String a , String b , int n , int m)
    {
        int deletion = m - LCS(a,b,n,m);
        int insertion =  n - LCS(a,b,n,m);
        System.out.println("Number of Deletion : "+ deletion);
        System.out.println("Number of insertion : "+insertion);
    }
    public static void main(String [] args)
    {
        String a = "acbcf";
        String b = "abcfad";
        int n = a.length(); 
        int m = b.length(); 
        Minimum_Number_Of_Insertion_Deletion(a,b,n,m);
    }
}