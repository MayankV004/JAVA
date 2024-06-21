class RemoveDuplicates {
    public static boolean [] map = new boolean[26];
    public static void main(String[] args) {
        String s = "aaccbbnmmooaaaabbxmnrwnnmx";
        RemoveDuplicate(s,0,"")
;    }

    public static void RemoveDuplicate(String s , int i , String newString ) {
        
        if (i == s.length())
        {
            System.out.println(newString);
            return;
        }
        
        char curr = s.charAt(i);
        if (map[curr - 'a'])
        {
            RemoveDuplicate(s,i+1,newString);
        }
        else
        {
            newString += curr+" ";
            map[curr - 'a'] = true;
            RemoveDuplicate(s,i+1,newString);
        }
    }
}
