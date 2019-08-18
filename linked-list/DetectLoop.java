class Loop
{
    int countNodesinLoop(Node head)
    {
	    //Add your code here.
	    Node slow_ptr = head;
	    Node fast_ptr = head;
	    boolean flag = false;
	    while(slow_ptr != null && fast_ptr != null && fast_ptr.next != null){
	        slow_ptr = slow_ptr.next;
	        fast_ptr = fast_ptr.next.next;
	        if(slow_ptr == fast_ptr){
	            flag = true;
	            break;
	        }
	    }
	    int count = 0;
	    if(!flag)
	        return 0;
	   else{
	       Node temp = slow_ptr.next;
	       count =1;
	       while(temp != slow_ptr){
	           count++;
	           temp = temp.next;
	       }
	       return count;
	   }
    }
}
