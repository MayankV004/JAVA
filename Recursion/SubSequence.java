class SubSequence
{
    public static void main(String [] args)
    {
        String s = "abc";
        Sub(s,0,"");
    }
    public static void Sub(String s , int i , String newString)
    {
        if (i == s.length())
        {
            System.out.println(newString);
            return;
        }
        char curr = s.charAt(i);

        // to be
        Sub(s,i+1,newString+curr);
        // or not to be
        Sub(s,i+1,newString);
    }

}