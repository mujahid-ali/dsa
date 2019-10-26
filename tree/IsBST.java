
/*
Check for BST
*/
class GfG
{
    int isBST(Node root)
    {
        // Your code here
        return isBST_helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int isBST_helper(Node root, int min, int max){
        if(root == null)
            return 1;

        if(root.data < min || root.data > max)
            return 0;

        int l = isBST_helper(root.left,min,root.data);
        int r = isBST_helper(root.right,root.data,max);

        if(l == 1 && r == 1)
            return 1;
        else
            return 0;
    }
}
