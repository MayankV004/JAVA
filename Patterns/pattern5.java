import java.util.Scanner;

class pattern5
{
    public static void main(String [] args)
    {
        System.out.println("Enter the Number : ");
        int x = new Scanner(System.in).nextInt();

        for (int i = 1 ; i <= x ; i++)
        {
            //printing Spaces
            for (int j = 1 ; j <= x - i; j++)
            {
                System.out.print(" ");
            }
            //printing Stars
            for (int j = 1 ; j <= i ; j++)
            {
                System.out.print("*");
            }

            System.out.println();

        }



    }
}