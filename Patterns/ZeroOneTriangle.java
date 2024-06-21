import java.util.Scanner;
class ZeroOneTriangle
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Pattern Printing : ");
        int n = sc.nextInt();
        int count=1;
        for (int i = 1 ; i <= n ; i++)
        {
            for (int j = 1 ; j <= i;j++)
            {
                if (count == 0)
                {
                    System.out.print(count+" ");
                    count = 1;
                }
                else
                {
                    System.out.print(count+" ");
                    count = 0 ;    
                }
                
            }
            System.out.println();
        }

    }
}