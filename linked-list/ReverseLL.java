class ReverseLL
{
    // This function should reverse linked list and return
   // head of the modified linked list.
   Node reverseList(Node head)
   {
        // add code here
        Node ptr1 = head;
        Node ptr2 = head;
        Node ptr3 = head.next;

        while(ptr1 != null && ptr3 != null){
            ptr2 = ptr1;
            ptr1 = ptr3;
            ptr3 = ptr3.next;
            ptr1.next = ptr2;
        }
        head.next = null;
        head = ptr1;
        return head;
   }
}
