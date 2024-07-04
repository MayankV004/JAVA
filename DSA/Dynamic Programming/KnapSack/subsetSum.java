class subsetSum
{
    public static boolean SubSetSum(int arr[] , int n , int sum)
    {
        boolean [][] t = new boolean[n+1][sum+1];
        for(int i = 0 ; i <= n ; i++)
        {
            t[i][0] = true;
        }
        for(int i = 0 ; i <= sum ; i++)
        {
            t[0][i] = false;
        }
        for(int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= sum ; j++)
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
        return t[n][sum];
    }
    public static void main(String [] args)
    {
        int arr[] = {2 , 3 , 7 , 8 , 10};
        int n = arr.length;
        int sum = 11;
        boolean ans = SubSetSum(arr , n , sum);
        System.out.println(ans);
    }
}