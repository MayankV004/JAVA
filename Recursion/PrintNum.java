class PrintNum
{
    public static void main(String [] args)
    {
        int a = 5;
        Sum(a);
    }

    public static void Sum(int x)
    {
        if (x == 0)
        {
            return ;
        }
        Sum(x - 1);
        System.out.println(x);
    }
}