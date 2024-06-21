import java.util.Scanner;
class Factorial
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int x = sc.nextInt();
        int factorial = Fact(x);
        System.out.println(factorial);

    }

    public static int Fact(int n)
    {
        if(n == 0)
            return 1 ;

        return n * Fact(n-1);
    }
}