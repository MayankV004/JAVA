import java.util.*;

class BST
{
    static class TreeNode
    {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static TreeNode Insert(TreeNode root , int value)
    {
        if (root == null)
        {
            root = new TreeNode(value);
            return root;
        }
        if (root.data > value)
        {
            root.left = Insert(root.left , value);
        }
        else
        {
            root.right = Insert(root.right,value);
        }
        return root;
    }

    public static void Inorder(TreeNode root)
    {
        if (root == null)
        {
            return ;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);


    }
    public static Boolean Search(TreeNode root , int key)
    {
        if (root == null)
        {
            return false;
        }
        if (root.data == key)
        {
            return true;
        }
        else if (root.data > key)
        {
            return Search(root.left , key);
        }
        else
        {
            return Search(root.right , key);
        }
        
    }
    public static TreeNode Delete(TreeNode root , int key)
    {
        if(root.data > key)
        {
            root.left = Delete(root.left , key);
        }
        else if(root.data < key)
        {
            root.right = Delete(root.right , key);
        }
        else
        {
            //root.data == key (Found)
            //case 1
            if (root.right == null && root.left == null)
            {
                return null;
            }


            // Case 2
            if (root.left == null)
            {
                return root.right;
            }
            else if(root.right == null)
            {
                return root.left;
            }
            // Case 3
            TreeNode IS = inorderSuccessor(root.right);
            root.data = IS.data;
            root.right = Delete(root.right , IS.data);
        }
        return root;
    }
    public static TreeNode inorderSuccessor(TreeNode root)
    {
        while(root.left != null)
        {
            root = root.left;
        }
        return root;
    }
    public static void PrintRange(TreeNode root , int x , int y)
    {
        if(root == null)
        {
            return;
        }
        if (root.data >= x && root.data <= y)
        {
            PrintRange(root.left , x , y);
            System.out.print(root.data +" ");
            PrintRange(root.right , x , y);
        }
        else if(root.data > y)
        {
            PrintRange(root.left , x , y);
        }
        else
        {
            PrintRange(root.right , x , y);
        }
    }
    public static void PrintPath(ArrayList<Integer>path)
    {
        for (int i = 0 ; i < path.size() ; i++)
        {
            System.out.print(path.get(i)+" -> ");
        }
        System.out.println();
    }
    public static void RootToPath(TreeNode root , ArrayList<Integer> path) 
    {
        if (root == null)
        {
            return ; 
        }
        path.add(root.data);
        //leaf node condition
        if (root.left == null && root.right == null)
        {
            PrintPath(path);
        }
        else
        {
            RootToPath(root.left , path);
            RootToPath(root.right , path);
        }
        path.remove(path.size()-1);

    }


    public static void main(String [] args)
    {
        int values [] = {8,5,3,1,4,6,10,11,14};
        TreeNode root = null;

        for (int i : values)
        {
            root = Insert(root , i);
        }
        Inorder(root);
        System.out.println();
        // System.out.println(Search(root , 6));\
        //Single Child
        // Delete(root , 4);
        // Inorder(root);
        //Two child
        // Delete(root , 5);
        // Inorder(root);
        // PrintRange(root , 6 ,10);
        RootToPath(root , new ArrayList<>());
    }
}