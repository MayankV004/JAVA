import java.util.Scanner;

class pattern3
{
    public static void main(String [] args)
    {
        System.out.println("Enter the Number : ");
        int x = new Scanner(System.in).nextInt();

        for (int i = 0 ; i < x ; i++)
        {
            for (int j = 0 ; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}