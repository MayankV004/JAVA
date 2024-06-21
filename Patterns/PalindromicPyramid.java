import java.util.Scanner;
class PalindromicPyramid
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number for Pattern Printing : ");
        int n = sc.nextInt();
        int count=1;
        for (int i = 1 ; i <= n ; i++)
        {
            for(int j = 1 ; j <= n - i + 1 ; j++)
            {
                System.out.print("  ");
            }
            for (int j = i ; j >= 1;j--)
            {
                System.out.print(j+" ");
            }
            for (int j = 2 ; j<= i ; j++)
            {
                
                System.out.print(j+" ");
                
            }
            System.out.println();

        }

    }
}