import java.util.Scanner;

class pattern6
{
    //Solution 1
    // public static void main(String [] args)
    // {
    //     System.out.println("Enter the Number : ");
    //     int x = new Scanner(System.in).nextInt();

    //     for (int i = 1 ; i <= x ; i++)
    //     {
    //         for (int j = 1 ; j <= x + 1 - i; j++)
    //         {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }



    // }
    //Solution 2
    public static void main(String [] args)
    {
        System.out.println("Enter the Number : ");
        int x = new Scanner(System.in).nextInt();

        for (int i = x ; i >= 0 ; i--)
        {
            for (int j = 1 ; j <= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }



    }
}