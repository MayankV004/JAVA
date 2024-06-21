import java.util.Scanner;

class pattern4
{
    public static void main(String [] args)
    {
        System.out.println("Enter the Number : ");
        int x = new Scanner(System.in).nextInt();

        for (int i = 1 ; i <= x ; i++)
        {
            for (int j = 1 ; j <= i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }



    }
}