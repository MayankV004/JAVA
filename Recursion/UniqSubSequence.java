import java.util.HashSet;
class UniqSubSequence
{
    public static void main(String [] args)
    {
        String s = "aaa";
        HashSet<String> set = new HashSet<>();
        Sub(s,0,"",set);
    }
    public static void Sub(String s , int i , String newString,HashSet<String> set)
    {
        if (i == s.length()) 
        {
            if (set.contains(newString))
            {
                return;
            }
            else
            {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char curr = s.charAt(i);

        // to be
        Sub(s,i+1,newString+curr,set);
        // or not to be
        Sub(s,i+1,newString,set);
    }

}