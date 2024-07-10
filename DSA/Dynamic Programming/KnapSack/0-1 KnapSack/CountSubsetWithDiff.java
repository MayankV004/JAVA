class CountSubsetWithDiff
{
    public static int CountSubsetWithGivenDifference(int []arr , int diff)
    {
        int arrSum = 0;
        // Calculating sum of all elements of the array
        for(int i : arr)
        {
            arrSum += i;
        }
        /*
        as we want to find the subsets with the given difference (diff)
        basically S1 - S2 = diff

        So , Now 

        Sum(s1) - Sum(s2) = diff
        Sum(s1) + Sum(s2) = Sum(arr)
        -----------------------------
        2 Sum(s1) = diff + Sum(arr)
        -----------------------------

        ->           diff + Sum(arr)
           Sum(s1) = ----------------
                            2

        So,  Now We just need to count the no. of Subset which has sum equals to Sum(s1).
        ThereFore the problem is reduced to Count the Subset With given Sum. 
        */
        int n = arr.length;
        int sum = (diff + arrSum)/2;

        int [][]t = new int[n+1][sum+1];
        for(int i = 0 ; i <= n ; i++)
        {
            t[i][0] = 1;
        }
        for(int i = 1 ; i <= sum ; i++)
        {
            t[0][i] = 0;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= sum ; j++)
            {
                if(arr[i - 1] <= j)
                {
                    t[i][j] = t[i - 1][j - arr[i - 1]] + t[i-1][j];
                }
                else
                {
                    t[i][j] = t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String[] args)
    {
        int arr[] = {1 , 1 , 2 , 3};
        int diff = 1;
        int ans = CountSubsetWithGivenDifference(arr , diff);
        System.out.println("No. of subsets : "+ans);
    }
}