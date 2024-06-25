class BitwiseOperator
{
    public static void main(String [] args)
    {
        int a = 5;
        int b = a >> 1; // right shift 
        int c = a << 1; // left shift
        int d = ~a; // two's complement
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}