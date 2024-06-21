class PathInMaze
{
    public static int PathCount(int i , int j , int n , int m)
    {
        if (i == n || j == m )
        {
            return 0;
        }
        if (i == n-1 || j == m-1)
        {
            return 1;
        }

        int downpath = PathCount(i+1 , j , n , m);
        int rightpath = PathCount(i , j+1, n , m);

        return downpath + rightpath;
    }




    public static void main(String [] args)
    {
        int n = 3 , m = 3;
        int paths = PathCount(0,0,n,m);
        System.out.println("The total number of paths are : "+ paths);
    } 
}