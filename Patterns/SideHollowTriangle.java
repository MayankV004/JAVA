class SideHollowTriangle
{
    public static void main(String [] args)
    {
        int n = 4;

        for (int k = 0 ; k < n; k++)
        {
            for (int i = 1 ; i <= n - 1; i++)
        {
            for (int j = 0 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        for (int i = 1 ; i <= n-3 ; i++)
        {
            for (int j = 0 ; j <= i-1 ; j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
        }
        
    }
}