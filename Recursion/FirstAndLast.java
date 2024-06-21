class FirstAndLast
{   static int First = -1;
    static int last = -1;
    public static void main(String [] args)
    {
        String s = "abaachjedegdgnaabbcd";
        char x = 'a';
        fal(s,0,x);
        System.out.println("The First Occurence : "+First);
        System.out.println("The last Occurence : "+last);
    }
    public static void fal(String s , int i , char x)
    {
        if (i == s.length()-1)
            return;
        // first occurrence
        if ( x == s.charAt(i))
        {
            if (First == -1)
            {
                First = i;
            }
            else
            {
                last = i;
            }
            
        }
        fal(s,i+1,x);
    }
}