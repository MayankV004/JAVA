class SwapNumberBitwise
{
    public static void swap(int a , int b)
    {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("new value of a : "+ a);
        System.out.println("new value of b : "+ b);
    }
    public static void main(String [] args)
    {
        int a = 5 ; int b = 7;
        System.out.println("Original value of a : "+a);
        System.out.println("Original value of b : "+b);
        swap(a , b);
        
    }
}