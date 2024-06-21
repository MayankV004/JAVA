import java.util.Scanner;

class pattern2
{
    public static void main(String [] args)
    {
        System.out.println("Enter the Number : ");
        int x = new Scanner(System.in).nextInt();

        for (int i = 0 ; i < x ; i++)
        {
            for (int j = 0 ; j < x; j++)
            {
                if ( i == 0 || j == 0 || i == x -1 || j == x-1 )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}