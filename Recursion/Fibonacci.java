import java.util.Scanner;
class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1 ;

        System.out.print(a+" ");
        System.out.print(b+ " ");

        Fibo(a , b , n - 2 );
    }
    public static void Fibo(int a , int b , int n)
    {
        if (n == 0 )
            return;
        int c = a + b;
        System.out.print(c+" ");
        Fibo( b , c , n - 1 );
    }
}