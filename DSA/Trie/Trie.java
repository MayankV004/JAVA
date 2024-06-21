class Trie
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



    public static void main(String [] args)
    {
        String [] words = {"the" , "a" , "there" , "their" , "any"};
        for (String i : words)
        {
            Insert(i);
        }

        System.out.println(Search("there"));
        System.out.println(Search("thor"));
        System.out.println(Search("an"));
    }
}