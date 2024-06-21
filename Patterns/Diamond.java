import java.util.Scanner;
class Diamond
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Pattern Printing : ");
        int n = sc.nextInt();

        for (int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i + 1 ; j++)
            {
                System.out.print("  ");
            }
            for (int j = i ; j >= 1;j--)
            {
                System.out.print("*"+" ");
            }
            for (int j = 2 ; j<= i ; j++)
            {
                
                System.out.print("*"+" ");
                
            }
            System.out.println();

        }
        for (int i = n - 1; i >=1 ; i--)
        {
            for(int j = 1 ; j <= n - i + 1 ; j++)
            {
                System.out.print("  ");
            }
            for (int j = i ; j >= 1;j--)
            {
                System.out.print("*"+" ");
            }
            for (int j = 2 ; j <= i ; j++)
            {
                
                System.out.print("*"+" ");
                
            }
            System.out.println();

        }



    }
}