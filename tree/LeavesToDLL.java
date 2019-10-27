/*
Create a DLL of all leaf nodes.
Java compiler was having some problem so, here is the cpp code.

void convertHelper(Node* root, Node** head_ref, Node* &temp)
{
    if(root==NULL)
    return;
    if(!root->left && !root->right)
    {
        if(temp)
        {
            temp->right = root;
            root->left = temp;
            temp = root;
        }
        else{
            temp =root;
            *(head_ref) = root;
        }
        return;
    }
    convertHelper(root->left,head_ref,temp);
        convertHelper(root->right,head_ref,temp);
}
Node *convertToDLL(Node *root,Node **head_ref)
{
Node* temp = NULL;
convertHelper(root,head_ref,temp);
return root;
}
void helper(Node *root, Node** head_ref, Node* &prev){
            if(root == NULL)
                return;

            if(!root->left && !root->right){
                if(prev){
                    prev->right = root;
                    root->left = prev;
                    prev = root;

                }
                else{
                    prev = root;
                    *(head_ref) = root;

                }
                return;
            helper(root->left,head_ref,prev);
            helper(root->right,head_ref,prev);
            }
    }
*/

class GfG
{

    Node convertToDLL(Node root)
    {
        Node head = null;
        Node prev = null;
        convertToDLL_helper(root,head,prev);
        pritntDLL(head);

        return root;

    }

    public static void convertToDLL_helper(Node root, Node head, Node prev)
    {
        //your code here
        if(root == null)
            return ;

        if(root.left == null && root.right == null){
            if(head == null){
                head = root;
            }
            else{
                root.left = prev;
                prev.right = root;
            }
            prev = root;
        }

         convertToDLL_helper(root.left,head,prev);
         convertToDLL_helper(root.right,head,prev);

    }

    public void pritntDLL(Node head)
    {
        Node n = head ;//head being head of the Dlinkedlist
        Node temp = null;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            temp = n;
            n = n.right;
        }
        System.out.println();
        while(temp !=null)
        {
          System.out.print(temp.data+" ");
            temp = temp.left;
        }
    }
}
