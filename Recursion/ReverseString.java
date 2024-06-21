class ReverseString
{
    public static void RevStr(String s , int i)
    {
        if (i == 0)
        {
            System.out.print(s.charAt(i)+" ");
            return;
        }
        System.out.print(s.charAt(i)+" ");
        RevStr(s,i-1);

    }
    public static void main(String [] args)
    {
        String s = "abcd";
        int i = s.length()-1;
        RevStr(s,i);
    }
}