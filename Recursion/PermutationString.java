class PermutationString
{
    public static void StringPermutation(String str , String perm , int index)
    {
        if(str.length() == 0)
        {
            System.out.println(perm);
            return;
        }
        for (int i = 0 ; i < str.length() ; i++)
        {
            char currChar = str.charAt(i);
            String newPerm = str.substring(0,i) + str.substring(i+1);
            StringPermutation(newPerm , perm + currChar , index + 1);
        }
    }





    public static void main(String [] args)
    {
        String str = "ABC";
        StringPermutation(str , "" , 0);
    }
}