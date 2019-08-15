{
import java.util.*;
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }

public class GFG2
{
    Node head;

	/* Function to print linked list */
    void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }
        System.out.println();
    }


    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node)
	{
		if (head == null)
		{
			head = node;
		} else
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }

     /* Drier program to test above functions */
    public static void main(String args[])
    {


        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
         Scanner sc = new Scanner(System.in);
		 int t=sc.nextInt();

		 while(t-->0)
         {
			int n = sc.nextInt();
            GFG2 llist1 = new GFG2();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            llist1.addToTheLast(head);
            for (int i = 1; i < n; i++)
			{
				int a = sc.nextInt();
				llist1.addToTheLast(new Node(a));
			}
		    llist1.head= head;
		    n = sc.nextInt();
			a1=sc.nextInt();
		    GFG2 llist2=new GFG2();
			Node head2= new Node(a1);
            llist2.addToTheLast(head2);
		    llist2.head=head2;
            for (int i = 1; i < n; i++)
			{
				int a = sc.nextInt();
				llist2.addToTheLast(new Node(a));
			}
			GFG obj=new GFG();
			Node start=obj.findUnion(llist1.head,llist2.head);
		    llist1.printList(start);
		}
	}
}


}
/*This is a function problem.You only need to complete the function given below*/
class GFG
{

	Node findUnion(Node head1,Node head2)
	{
	    //Add your code here.
	    Set<Integer> set = new TreeSet<>();
	    Node temp1 = head1;
	    Node temp2 = head2;

	    while(temp1 != null){
	        set.add(temp1.data);
	        temp1 = temp1.next;
	    }
	    while(temp2 != null){
	        set.add(temp2.data);
	        temp2 = temp2.next;
	    }
	    GFG2 llist3 = new GFG2();
	    //Node head3= new Node(set.iterator().next());
	    Node head3 = null;
	    for(int x: set){
	      //for(int i =1; i<array.length;i++){
	        System.out.print(x + " ");
	        Node New = new Node(x);
	        llist3.addToTheLast(New);
	        //insert all the elements into a new ll and return head.
	    }
	    llist3.head = head3;
	    //Node head = null;
	    return head3; //
	}

	//public static void insert()
}
