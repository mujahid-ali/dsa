struct Node
{
    int data;
    struct Node* left;
    struct Node* right;

    Node(int x){
        data = x;
        left = right = NULL;
    }
};*/
// function should print the topView of the binary tree
void topUtil(struct Node *root, int curr, int hd, map<int, pair<int,int>> &m){
    if(root == NULL)return;

    if(m.find(hd) == m.end()){
        m[hd] = make_pair(root->data,curr);
    }
    else{
        if(m[hd].second>curr){
            m[hd].second = curr;
            m[hd].first = root->data;
        }
    }

    topUtil(root->left,curr+1,hd-1,m);
    topUtil(root->right,curr+1,hd+1,m);
}

void topView(struct Node *root)
{
    //Your code here
    map<int, pair<int,int>> m;

    topUtil(root,0,0,m);

    map<int, pair<int,int>>:: iterator it;
    for(it = m.begin(); it!= m.end(); ++it){
        pair<int, int> p = it->second;
        cout<<p.first<<" ";
    }
}
