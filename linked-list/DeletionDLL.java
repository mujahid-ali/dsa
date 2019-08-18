class GfG
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	// Your code here
	Node temp = head;
	if(x == 1){
	    head.next.prev = null;
	    temp = head.next;
	    head.next = null;
	    head = temp;
	}else{
	    int i =1;
	    while(temp != null && i<x){
	        temp =temp.next;
	        i++;
	    }
	    temp.prev.next = temp.next;
	    if(temp.next !=null){
	        temp.next.prev = temp.prev;
	    }
	    temp.next = null;
	    temp.prev = null;
	}
	return head;
    }
}
