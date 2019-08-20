class GfG
{
    // head: head node
    Node removeDuplicates(Node root)
    {
	// Your code here
	Node prev = root;
	Node temp = root.next;
	while(temp != null ){
	    if(prev.data == temp.data){
	        prev.next = temp.next;
	        temp = temp.next;
	        }
	    else{
	        prev = temp;
	        temp = temp.next;
	    }

	    }
	 return root;
    }

}
