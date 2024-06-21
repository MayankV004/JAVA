import java.util.*;

class BinaryTreeAc
{
    static class TreeNode 
    {
        int data;
        TreeNode left;
        TreeNode right;

        TreeNode (int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree
    {
        static int idx = -1;
        public static TreeNode BuildTree(int nodes[])
        {
            idx++;
            if (nodes[idx] == -1)
            {
                return null;
            }
            TreeNode newnode = new TreeNode(nodes[idx]);
            newnode.left = BuildTree(nodes);
            newnode.right = BuildTree(nodes);
            return newnode;
        }

        public static void Preorder(TreeNode root)
        {
            if(root == null)
            {
                return ;
            }
            System.out.print(root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public static void levelOrderTraversal(TreeNode root)
        {
            if (root == null)
            {
                return;
            }
            Queue<TreeNode> q = new LinkedList<>();

            q.add(root);
            q.add(null);

            while(!q.isEmpty())
            {
                TreeNode curr = q.remove();
                if (curr == null)
                {
                    System.out.println();
                    if (q.isEmpty())
                    {
                        break;
                    }
                    else
                    {
                        q.add(null);
                    }
                }
                else
                {
                    System.out.print(curr.data +" ");
                    if (curr.left != null)
                    {
                        q.add(curr.left);
                    }
                    if (curr.right != null)
                    {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int countNodes(TreeNode root)
        {
            if (root == null )
            {
                return 0;
            }
            int leftNodes = countNodes(root.left);
            int rightNodes = countNodes(root.right);
            return leftNodes + rightNodes + 1;
        }
        public static int SumNodes(TreeNode root)
        {
            if (root == null )
            {
                return 0;
            }
            int leftSum = SumNodes(root.left);
            int rightSum = SumNodes(root.right);
            return leftSum + rightSum + root.data;
        }

        public static int height(TreeNode root)
        {
            if (root == null)
            {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            int H = Math.max(lh,rh) + 1;
            return H;
        }
        
        //O(n * n)
        public static int Diameter(TreeNode root)
        {
            if (root == null)
            {
                return 0;
            }
            int diam1 = Diameter(root.left);
            int diam2 = Diameter(root.right);
            int diam3 = height(root.left) + height(root.right) + 1;
            return Math.max( diam3, Math.max(diam1,diam2));
        }

        static class TreeInfo
        {
            int ht;
            int diam;

            TreeInfo(int ht , int diam)
            {
                this.ht = ht;
                this.diam = diam;
            }
        }

        public static TreeInfo Diameter2(TreeNode root)
        {
            if (root == null)
            {
                return new TreeInfo(0,0);
            }

            TreeInfo left = Diameter2(root.left);
            TreeInfo right = Diameter2(root.right);

            int myHeight = Math.max(left.ht , right.ht) + 1 ;

            int diam1 = left.diam;
            int diam2 = right.diam;
            int diam3 = left.ht + right.ht + 1;

            int myDiameter = Math.max(diam3 , Math.max(diam1 , diam2));

            TreeInfo myInfo = new TreeInfo(myHeight , myDiameter);
            return myInfo;
        }
    }


    public static void main(String [] args)
    {

        int nodes[] = {1, 2, 4, -1 , -1 ,5 , -1 , -1 , 3 , -1 , 6 , -1 , -1};
        BinaryTree tree = new BinaryTree();

        TreeNode root = tree.BuildTree(nodes);
        tree.Preorder(root);
        System.out.println();
        tree.levelOrderTraversal(root);
        
        System.out.println("Total no. of nodes is : "+ tree.countNodes(root));
        System.out.println("Total Sum of nodes is : "+ tree.SumNodes(root));
        System.out.println("Height of Tree is : "+ tree.height(root));
        System.out.println("Diameter of Tree is : "+ tree.Diameter(root));
        System.out.println("Diameter of Tree is : "+ tree.Diameter2(root).diam);
        

    }




}