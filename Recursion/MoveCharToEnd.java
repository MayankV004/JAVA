class MoveCharToEnd
{
    static String newString = "";
    static int count = 0 ;
    public static void main(String [] args)
    {
        String s = "abxcxfgxnxmmxn";
        char ch = 'x';
        MoveChar(s,ch,0);
        System.out.println(newString);
    }
    public static void MoveChar(String s , char ch , int i)
    {
        if (i == s.length())
        {

            for (int j = 0 ; j < count ; j++)
            {
                newString = newString + ch+" ";
            }
            return;
        }
        if(s.charAt(i) != ch)
        {
            newString = newString + s.charAt(i)+" ";
            MoveChar(s,ch,i+1);
        }
        else{
            count++;
            MoveChar(s,ch,i+1);
        }
        
    }
}