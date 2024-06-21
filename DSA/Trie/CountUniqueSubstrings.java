import java.util.*;

class CountUniqueSubstrings
{
    //all prefix of all suffix
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
    public static int countUniqSubstring(Node root)
    {
        Node curr = root;
        if (curr == null)
        {
            return 0;
        }
        int count = 0 ;
        for (Node child : curr.children)
        {
            if (child != null)
            {
            count += countUniqSubstring(child);
            }
        }
        return count + 1; 
    }
    // 1-> Find all suffix of String .
    // 2-> Create a Trie .
    // 3-> Total nodes of trie  = Count of unique Prefixes
    public static void main(String [] args)
    {   
        
        String str = "ababa";
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            Insert(str.substring(i));
        }
        System.out.println("The count of Unique Substrings : "+countUniqSubstring(root));
    }
}