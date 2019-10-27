/*
https://practice.geeksforgeeks.org/problems/exchange-the-leaf-nodes
*/

void swap(Node *a, Node *b){
    int t = b->data;
    b->data = a->data;
    a->data = t;
}


void helper(Node *root, Node* &temp ){
    if(root == NULL)
        return;

        if(root->left == NULL && root->right == NULL){
            if(temp){
                swap(root,temp);
                temp = NULL;
            }
            else{
                temp = root;
            }
        }
        helper(root->left,temp);
        helper(root->right,temp);
}


void pairwiseSwap(Node *root)
{
    // code here
    Node *temp = NULL;
    helper(root,temp);
}
