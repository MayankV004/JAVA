class MatrixChainMultiplication
{
    public static int MCMRecursive(int arr[] , int i , int j)
    {
        if(i >= j)
        {
            return 0;
        }
        int minimumCost = Integer.MAX_VALUE;
        for(int k = i ; k < j ; k++)
        {
            int temp = MCMRecursive(arr , i , k) + MCMRecursive(arr , k+1 , j) + arr[i-1]*arr[k]*arr[j];

            if(temp < minimumCost)
            {
                minimumCost = temp;
            }
        }
        return minimumCost;
    }
    public static void main(String [] args)
    {
        int []arr = {10 , 30 , 5 , 60};
        int ans = MCMRecursive(arr , 1 , arr.length - 1);
        System.out.println("Minimum Cost : "+ans);
    }
}