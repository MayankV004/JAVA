import java.util.Scanner;

class XPowN
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int x = sc.nextInt();
        System.out.println("Enter the Power : ");
        int n = sc.nextInt();
        int ans = Xpow(x,n);
        System.out.println("The Answer is : "+ans);


    }
    public static int Xpow(int x , int n)
    {
        if (n == 0)
            return 1;
        if (x == 0)
            return 0;
        int xpowm1 = Xpow(x,n-1);
        int xp = x * xpowm1;
        return xp;
    }
}