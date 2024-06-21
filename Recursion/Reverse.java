class Reverse
{
    static int sum = 0;
    public static void main(String [] args)
    {
        int x = 1234;
        Rev(x);
        System.out.println(sum);
    }
    public static void Rev(int x)
    {
        if (x == 0)
            return;
        int rem = x % 10;
        sum = sum * 10 + rem;
        Rev(x/10);
    }
}