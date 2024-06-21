import java.util.Scanner;
class SumOfN
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int x = sc.nextInt();
        int sum = SumN(x);
        System.out.println(sum);

    }

    public static int SumN(int n)
    {
        if(n < 1)
            return 0 ;

        return n + SumN(n-1);
    }
}