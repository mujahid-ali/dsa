class GfG
{
    Node reverse(Node head)
    {
        // Your code here
        Node temp = head;
        Node curr = head;
         if(temp.next== null){
            return head;
            }


        while (curr != null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        head = temp.prev;
        return head;
    }
}
