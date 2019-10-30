

class BST
{
    Node LCA(Node node, int n1, int n2)
    {
        // Your code here
        if (node == null)
            return null;

        if(node.data > n1 && node.data > n2)
            return LCA(node.left,n1,n2);

        if(node.data < n1 && node.data < n2)
            return LCA(node.right,n1,n2);

        return node;
    }

    Node LCA_Iterative(Node root){
      while(root != null){
        if(root.data > n1 && root.data > n2)
          root=root.left;
        else if(root.data < n1 && root.data <n2)
            root=root.right;

          else break;
      }
      return root;
    }

}
