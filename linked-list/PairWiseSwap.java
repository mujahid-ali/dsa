class GfG
{
    public static Node pairwiseSwap(Node node)
    {

       // add your code here
       Node temp1 = node;
       Node temp2 = null;
       Node head = node;
       if(temp1.next != null){
         temp2 = node.next;
         head = temp2;
       }
       else{
         return node;
       }

       while(temp1 != null ){
         temp1.next = temp2.next;
         temp2.next = temp1;
         if(temp1.next != null){
         temp1 = temp1.next;
         temp2 = temp1.next;
         }
         else{
             break;
         }
       }
    return head;
    }
}
