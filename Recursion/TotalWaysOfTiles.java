class TotalWaysOfTiles
{
    public static int Tiles(int n , int m)
    {
        if (n == m)
        {
            return 2;
        }
        if (n < m)
        {
            return 1;
        }


        int horizontal = Tiles(n-1 , m);
        int Vertical = Tiles(n-m , m);
        return Vertical + horizontal;
    }

    public static void main(String [] args)
    {
        int n = 4 , m = 2 ;
        int ways = Tiles(n,m);
        System.out.println("Total no. of ways : "+ways);
    }
}