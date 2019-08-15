
class Solution {
    public void split(Node head){
       //Your code here, print both the splitted linked-lists
       Node p1 = head;
       Node p2 = head.next;
       Node head1 = head;
       Node head2 = head.next;
       Node temp1 = head1;
       Node temp2 = head2;
       while(p1 !=null && p2 !=null && p1.next !=null && p2.next !=null){
           p1 = p2.next;
           Node New = new Node(p1.data);
           New.next = null;
           temp1.next = New;
           p2 = p1.next;
           Node New2 = new Node(p2.data);
           New2.next= null;
           temp2.next = New2;

       }
       temp1 = head1;
       while(temp1 != null){
           System.out.print( temp1.data +" ");
       }
       System.out.println();
       temp2 = head2;
       while(temp2 != null){
           System.out.print(temp2.data + " ");
       }
       System.out.println();
    }
    public void split2(Node head){
     //Your code here, print both the splitted linked-lists

  if(head == null)
      return;

  Node ptr = head;
  Node head1 = head;
  Node head2 = head.next;
  Node temp1 = head1;
  Node temp2 = head2;
  int n =1;

  while( ptr != null ){
      if(n%2 != 0){
          System.out.print(ptr.data+ " ");
      }
      ptr= ptr.next;
      n++;
  }
  System.out.println();
  n=0;
  ptr = head.next;
  while(ptr != null){
      if(n%2 == 0){
          System.out.print(ptr.data+ " ");
      }
      ptr = ptr.next;
      n++;
  }
     System.out.println();
  }


}
