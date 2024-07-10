class TargetSum
{
    public static int Target(int []arr , int target)
    {
        int arrSum = 0;
        // Calculating sum of all elements of the array
        for(int i : arr)
        {
            arrSum += i;
        }
        /*
        Here we need to place +/- Such that the sum of array becomes Equal to target Sum (target)

        So , Basically Similar to Count the Subsets with given difference.
        Here we are seperating the array into the ones with + sign and - sign 

        like 
        s1 = +1 + 3 
        s2 = -1 - 2
        
        ThereFore -> it is  s1 - s2 = target Sum

        Sum(s1) - Sum(s2) = target
        Sum(s1) + Sum(s2) = Sum(arr)
        -----------------------------
        2 Sum(s1) = target + Sum(arr)
        -----------------------------

                     target + Sum(arr)
        ->  \Sum(s1) = ----------------
                            2

        So,  Now We just need to count the no. of Subset which has sum equals to Sum(s1).
        ThereFore the problem is reduced to Count the Subset With given Sum. 
        */
        int n = arr.length;
        int sum = (target + arrSum)/2;

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
        int target = 1;
        int ans = Target(arr , target);
        System.out.println("count : "+ans);
    }

}