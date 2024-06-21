class CallGuests
{
    public static int Guests (int n)
    {
        if ( n <= 1)
        {
            return 1;
        }
        int way1 = Guests(n-1);
        int way2 = (n-1)*Guests(n-2);
        return way1 + way2;
    }
    public static void main(String [] args)
    {
        int n = 4;
        System.out.println("Total no. of ways : "+ Guests(n));
    }
}