class CountSubset
{
    public static int CountSubSet(int arr[] , int n , int sum)
    {
        int [][] t = new int[n+1][sum+1];
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
                if(arr[i-1] <= j)
                {
                    t[i][j] = t[i-1][j - arr[i - 1]] + t[i - 1][j]; 
                }
                else
                {
                    t[i][j] = t[i - 1][j];
                }
            }
        }
        return t[n][sum];
    }
    public static void main(String [] args)
    {
        int arr[] = {2 , 3 , 5 , 6 , 8 , 10};
        int n = arr.length;
        int sum = 10;
        int ans = CountSubSet(arr , n , sum);
        System.out.println("No Of Subsets : "+ans);
    }
}