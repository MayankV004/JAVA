class TowerOfHanoi
{
    public static void main(String [] args)
    {
        int n = 5;
        Tower(n , "A","B","C");
    }
    public static void Tower(int n , String helper , String src , String dest)
    {
        if ( n == 1)
        {

            System.out.println("Transfer Disk " + n + " From "+src+ " to "+dest);
            return ;
        }
        Tower(n-1 , dest , src , helper);
        System.out.println("Transfer Disk " + n + " From "+src+ " to "+dest);
        Tower(n-1 , src , helper , dest );
    }
}