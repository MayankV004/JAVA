import java.util.*;
class PrintSCS
{
    private static String printSCS(String a , String b , int n , int m)
    {
        int [][]t = new int[n+1][m+1];

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
        StringBuilder sb = new StringBuilder();
        int i = n ; int j = m;
        while( i > 0 && j > 0)
        {
            if(a.charAt(i-1) == b.charAt(j-1))
            {
                sb.append(a.charAt(i-1));
                i--;
                j--;
            }
            else 
            {
                if(t[i][j-1] < t[i-1][j])
                {
                    sb.append(a.charAt(i-1));
                    i--;
                }
                else
                {
                    sb.append(b.charAt(j-1));
                    j--;
                }
            }
            
        }

        while( i > 0 )
        {
            sb.append(a.charAt(i-1));
            i--;
        }
        while( j > 0 )
        {
            sb.append(b.charAt(j-1));
            j--;
        }

        return sb.reverse().toString();

    }
    public static void main(String [] args)
    {
        String a = "AGGTAB";
        String b = "GXTXAYB";
        int n = a.length(); 
        int m = b.length();
        String ans = printSCS(a,b,n,m);
        System.out.println("Shorest Common SuperSequence : "+ans); 
    }
}