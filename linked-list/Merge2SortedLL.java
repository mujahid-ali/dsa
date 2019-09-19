class LinkedList
{
    Node sortedMerge(Node headA, Node headB) {
     // This is a "method-only" submission.
     // You only need to complete this method

     Node temp1 = headA;
     Node temp2 = headB;
     Node ptr = null;
     Node head = null;

     if(temp1 == null)
        return temp2;

    if(temp2 == null)
        return temp1;

    if(temp1.data <= temp2.data){
        head = temp1;
        ptr = temp1;
        temp1 = temp1.next;

    }
    else{
        head = temp2;
        ptr = temp2;
        temp2 = temp2.next;

    }
    while(temp1 != null && temp2 != null){
        if(temp1.data < temp2.data ){
            ptr.next = temp1;
            ptr = ptr.next;
            temp1 = temp1.next;
        }
        else{
            ptr.next = temp2;
            ptr = ptr.next;
            temp2 = temp2.next;
        }
    }
    while(temp1 != null){
        ptr.next = temp1;
        ptr = ptr.next;
        temp1 = temp1.next;
    }
    while(temp2 != null){
        ptr.next = temp2;
        ptr = ptr.next;
        temp2 = temp2.next;
    }
    return head;
   }
}
