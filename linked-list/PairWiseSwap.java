class GfG
{
    public static Node pairwiseSwap(Node node)
    {

       // add your code here
       if(node == null || node.next == null){
         return node;
       }

       Node prev = node;
       Node curr = node.next;

       node = curr;

       while(true ){
         Node temp = curr.next;
         curr.next = prev;

         if(temp == null || temp.next == null ){
           prev.next = temp;
           break;
         }
         prev.next = temp.next;

         prev = temp;
         curr = temp.next;
       }
    return node;
    }
}
