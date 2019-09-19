
// Flatten a Linked list in sorted order
class GfG
{
  public static Node merge(Node temp1, Node temp2){
    if(temp1 == null){
      return temp2;
    }
    if(temp2 == null){
      return temp1;
    }

    if(temp1.data < temp2.data){
      temp1.bottom = merge(temp1.bottom, temp2);
      return temp1;
    }
    else{
      temp2.bottom = merge(temp1, temp2.bottom);
      return temp2;
    }

  }
    Node flatten(Node root)
    {
      Node temp1 = root;
      Node temp2 = root.next;

      while(temp2 != null){
        Node temp = temp2.next;
        temp1 = merge(temp1,temp2);
        temp2 = temp;
      }
    return temp1;
    }
}
