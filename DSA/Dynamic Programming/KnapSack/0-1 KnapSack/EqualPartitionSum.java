class EqualPartitionSum
{
    public static boolean PartitionSum(int arr[] , int n , int sum)
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
        int arr[] = {1 , 5 , 5 , 11};
        int n = arr.length;
        int sum = 0;
        for(int i : arr)
        {
            sum += i;
        }
        if(sum % 2 != 0)
        {
            System.out.println("NO Equal Partition");
        }
        else
        {
            boolean ans = PartitionSum(arr , n , sum/2);
            System.out.println(ans);
        }
    }
}