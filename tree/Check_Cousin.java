
//Check if two nodes are cousin.(same level but different parent)
class Solution {

    // Function to complete
    public boolean isCousins(Node root, int x, int y) {
        // your code here
        // This function should return true if x and y are cousins, else return false
        Queue<Node> q = new LinkedList<>();

        if(root == null)
        return true;

        q.add(root);
        int level = 1;
        int xlevel = 0;
        int ylevel = 0;
        int xpar =0;
        int ypar =0;

        while(!q.isEmpty()){
            int k = q.size();
            while(k-- > 0){
            Node temp = q.poll();
            int temp1 = temp.data;

            if(temp.left != null){
            if(temp.left.data == x){
                xpar = temp.data;
                xlevel = level+1;
            }else
                if(temp.left.data == y ){
                    ypar = temp.data;
                    ylevel = level+1;
                }
            }
            if(temp.right != null){
            if(temp.right.data == x){
                xpar = temp.data;
                xlevel = level+1;
            }else if(temp.right.data == y){
                ypar = temp.data;
                ylevel = level+1;
            }
            }


            if(temp.left != null){
                q.add(temp.left);
            }

            if(temp.right != null){
                q.add(temp.right);
            }
            }
            level++;


        }
        if(xpar != ypar && xlevel == ylevel){
                return true;
            }
            else
                return false;
    }
}
