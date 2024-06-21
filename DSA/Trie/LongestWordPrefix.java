class LongestWordPrefix
{
    static class Node
    {
        Node []children;
        Boolean eow;
        public Node()
        {
            children = new Node[26];
            eow = false;
        }
    }
    static Node root = new Node();
    public static void Insert(String word)
    {
        Node curr = root;
        for (int i = 0 ; i < word.length() ; i++)
        {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null)
            {
                curr.children[idx] = new Node();
            }
            if (i == word.length() - 1)
            {
                curr.children[idx].eow = true;
            }
            curr = curr.children[idx];

        }
    }
    public static Boolean Search(String key)
    {
        Node curr = root;
        for (int i = 0 ; i < key.length() ; i++)
        {
            int idx = key.charAt(i) - 'a';

            if (curr.children[idx] == null)
            {
                return false;
            }
            if ((i == key.length() - 1 ) && (curr.children[idx].eow = false))
            {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    /*
    So basicallly for the Longest Prefix -> In ther trie  all the  (End of words) are True (line wise).

    */
   public  static String ans = "";
   public static void  LongestPrefix(Node root , StringBuilder temp)
   {
        if (root == null)
        {
            return ;
        }

        for (int i = 0 ; i < 26 ; i++)
        {
            if (root.children[i] != null && root.children[i].eow == true)
            {
                temp.append((char)(i+'a'));
                if (temp.length() > ans.length())
                {
                    ans = temp.toString();
                }
                LongestPrefix(root.children[i] , temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
   }

    public static void main(String [] args)
    {
        String [] words = {"a","banana","app","appl","ap","apply","apple"};
        for (String i : words)
        {
            Insert(i);
        }
        LongestPrefix(root , new StringBuilder(""));
        System.out.println(ans);
    }
}