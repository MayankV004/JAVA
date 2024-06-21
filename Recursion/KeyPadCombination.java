class KeyPadCombination
{
    public static String [] keywords = {"." , "abc" ,"def" ,"ghi" , "jkl" , "mno" , "pqrs" , "tu" , "vwx" , "yz"};

    public static void printCombination(String str , int index , String Combination) 
    {
        if (index == str.length())
        {
            System.out.println(Combination);
            return;
        }
        char currChar = str.charAt(index);
        String mapping = keywords[currChar - '0'];
        for (int i = 0 ; i < mapping.length() ; i++)
        {
            printCombination(str , index + 1 , Combination + mapping.charAt(i));
        }
    }


    public static void main(String [] args)
    {
        String str = "45";
        printCombination(str , 0 , "");
    }
}