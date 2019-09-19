{
import java.util.*;
class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}
class MergeLL
{
   static Node head;
    public static void addToTheLast(Node node)
	{
		if (head == null)
		{
			head = node;
		}
		else
		{
		   Node temp = head;
		   while (temp.next != null)
		   temp = temp.next;
		   temp.next = node;
		}
    }
    public static void printList(Node node)
    {
        if(node == null)
          return;
          while(node != null)
          {
              System.out.print(node.data + " ");
              node = node.next;
          }
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N = sc.nextInt();
            Node []a=new Node[N];
            for(int i = 0; i < N; i++)
              {
                  int n = sc.nextInt();
                  int p = sc.nextInt();
                  Node start=null,cur=null;
                Node head = new Node(p);
                start=head;
                cur=head;
                    for(int j = 1; j < n; j++)
                    {
                        int a1 = sc.nextInt();
                        Node ptr=new Node(a1);
                        cur.next=ptr;
                        cur=ptr;
                    }
                    a[i]=start;
              }
             Node start=a[0];
             Merge g = new Merge();

             Node res = g.mergeKList(a,N);
             if(res!=null)
             printList(res);
             System.out.println();

        }

    }
}
}
/*This is a function problem.You only need to complete the function given below*/
/*class Node
{
    int data;
    Node next;

    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
/*a is an array of Nodes of the heads of linked lists
  and N is size of array a*/
  class Merge
  {
      Node mergeKList(Node[]a,int N)
      {
       //Add your code here.
       int n = a.length;
       Node head = null;
       Node temp1 = null;
       Node temp2 = null;
       Node ptr = null;
       Node result = null;
       int i =0;
       for(i=0; i<n; i++){

           temp1 = head;
           temp2 = a[i];

           if(head == null){
             head = temp2;
             continue;
           }
           else if(temp2 == null){
             continue;
           }
           if(temp1.data <= temp2.data){
           ptr = temp1;
           head = temp1;
           temp1 = temp1.next;
         }
         else{
           ptr = temp2;
           head = temp2;
           temp2 = temp2.next;
         }
           while(temp1 !=null && temp2 != null){
               if(temp1.data <= temp2.data){
                   ptr.next = temp1;
                   ptr = ptr.next;
                   temp1 = temp1.next;
               }else{
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
       }
       return head;
      }
  }
