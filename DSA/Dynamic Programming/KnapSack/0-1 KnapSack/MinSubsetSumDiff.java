import java.util.*;
class MinSubsetSumDiff
{
    public static int MinSum(int [] arr)
    {
        int n = arr.length;
        int range = 0 ;
        for(int i : arr)
        {
            range += i;
        }

        boolean [][] t = new boolean[n+1][range+1];
        for(int i = 0 ; i <= n ; i++)
        {
            t[i][0] = true;
        }
        for(int i = 1 ; i <= range ; i++)
        {
            t[0][i] = false;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= range ; j++)
            {
                if(arr[i-1] <= j)
                {
                    t[i][j] = t[i-1][j - arr[i - 1]] || t[i - 1][j]; 
                }
                else
                {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i <= range / 2 ; i++) // till range / 2 (Half tak range ki)
        {
            if(t[n][i] == true) // last Row me half of range tak check kar rahe hain
            {
                list.add(i);
            }
        }
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0 ; i < list.size() ; i++)
        {
            minDiff = Math.min(minDiff , range - 2 * list.get(i));
        }
        return minDiff;



    }
    public static void main(String [] args)
    {
        int [] arr = {1 , 6 , 11 , 5};
        int ans = MinSum(arr);
        System.out.println("Minimum sum difference : "+ ans);
    }
}