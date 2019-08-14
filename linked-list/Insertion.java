void insertAtBeginning(int x)
{
    // Your code here
    Node temp = new Node(x);

        if(head != null){
        temp.next = head;
        head = temp;
        }
        if(head == null){
            head = temp;
        }


}

// Should insert a node at the end
void insertAtEnd(int x)
{
    // Your code here
        Node temp = new Node(x);
        if(head != null){
        Node temp2 = head;
        while(temp2.next != null){
            temp2 = temp2.next;
        }
        temp2.next = temp;
        temp.next = null;
        }

        if(head == null){
            head = temp;
        }

}




// Please do not delete this
void printList()
  {
      Node temp = head;
      while (temp != null)
      {
         System.out.print(temp.data+" ");
         temp = temp.next;
      }
      System.out.println();
  }
}
