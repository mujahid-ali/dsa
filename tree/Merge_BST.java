/*
class Node{
	int data;
	Node left, right;
	Node(int d){
		data=d;
		left=right=null;
	}
}*/
class GfG
{

  public static void inorder(Node root){
    if(root == null)
      return;

      inorder(root.left);
      System.out.print(root.data + " ");
      inorder(root.right);
  }
	public static void merge(Node root1 , Node root2)
    {
            //add code here.
            Stack<Node> s1 = new Stack<Node>();
            Stack<Node> s2 = new Stack<Node>();

            Node current1 = root1;
            Node current2 = root2;

            //s1.push(current1);
            //s2.push(current2);

            if(root1 == null){
              inorder(root2);
              return;
            }
            if(root2 == null){
              inorder(root1);
              return;
            }

            while( !s1.isEmpty() || current1 != null || !s2.isEmpty() || current2 != null ){
              if(current1 != null || current2 != null){
                if(current1 != null){
                  s1.push(current1);
                  current1 = current1.left;
                }
                if(current2 != null){
                  s2.push(current2);
                  current2 = current2.left;
                }
              }
              else{
                if(s1.isEmpty()){
                  while(!s2.isEmpty()){
                  current2 = s2.pop();
                  current2.left = null;
                  inorder(current2);
                  }
                  return;
                }
                if(s2.isEmpty()){
                  while(!s1.isEmpty()){
                    current1 = s1.pop();
                    current1.left = null;
                    inorder(current1);
                  }
                  return;
                }

                current1 = s1.pop();
                current2 = s2.pop();

                if(current1.data < current2.data){
                  System.out.print(current1.data + " ");
                  current1 = current1.right;
                  s2.push(current2);
                  current2 = null;
                }
                else{
                  System.out.print(current2.data + " ");
                  current2 = current2.right;
                  s1.push(current1);
                  current1 = null;

                }
              }
            }
    }
}
