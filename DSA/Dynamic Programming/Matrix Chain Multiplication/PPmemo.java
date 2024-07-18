import java.util.*;
class PPmemo
{
    public static int t[][] = new int[1001][1001];
    public static boolean isPalindrome(String s , int i , int j)
    {
        if( i >= j )
        {
            return true;
        }

        while( i<j )
        {
            if(s.charAt(i) != s.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    public static int partition(String s , int i , int j)
    {
        if( i >= j)
        {
            return 0;
        }
        if(t[i][j] != -1)
        {
            return t[i][j];
        }
        if(isPalindrome(s,i,j))
        {
            return 0;
        }

        int mn = Integer.MAX_VALUE;
        for(int k = i ; k < j ; k++)
        {
            int temp = 1 + partition(s , i , k) + partition(s , k+1 , j);

            if(mn > temp )
            {
                    mn = temp;
            }
        }
        return t[i][j] = mn;
    }
    public static void main(String [] args)
    {
        String s = "AABBDC";
        for(int []row : t)
        {
            Arrays.fill(row,-1);
        }
        int ans = partition(s , 0 , s.length() - 1);
        System.out.println(ans);
    }
}