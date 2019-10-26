/*
2
2
1 2 L 1 3 R
5
10 20 L 10 30 R 20 40 L 20 60 R 30 90 L

Output:
5
190

Explanation:
Testcase 1: Leaf nodes in the tree are 2 and 3, and their sum is 5.
*/

int sumLeaf(Node* root)
{
    // Code here
    static int sum = 0;
    if(root == NULL)
        return 0;

        if(root->left == NULL && root->right == NULL){
            return root->data;
        }
       int l = sumLeaf(root->left);
        int r = sumLeaf(root->right);
    return l +r;
}
