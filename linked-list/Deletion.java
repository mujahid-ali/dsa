
/*This is a function problem.You only need to complete the function given below*/
/* Linklist node structure
class Node
{
	int data;
	Node next;

	Node(int d)
	{
		data = d;
		next = null;
	}
}*/
/*You are required to complete below method*/
class GfG
{
    Node deleteNode(Node head, int x)
    {
	// Your code here
	if(head == null)
	    return null;

	 if(head.next == null){
	     return null;
	 }
	 if(head != null && head.next != null && x !=1){
	     Node temp = head;
	     Node temp2 = head;
	     int count = 0;
	     while(temp != null && count != x-1){
	         temp2 = temp;
	         temp = temp.next;
	         count ++;
	         }
	        temp2.next = temp.next;
	        temp.next = null;
	        return head;

	 }
	 if(head != null && head.next != null && x ==1){
	     Node temp = head;
	     head = head.next;
	     temp.next = null;
	     return head;
	 }
	return head;

    }
}
