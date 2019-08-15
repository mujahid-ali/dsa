class GfG
{
    Node deleteAllOccurances(Node head, int x)
    {
        // Your code here
        Node temp = head;
        Node prev = head;
        while(temp != null){

            if(temp.data == x && temp == head){
                temp = temp.next;
                prev = temp;
                head = temp;
                continue;
            }

            if(temp.data == x){
                prev.next = temp.next;
                temp = temp.next;
            }else{
                prev = temp;
                temp = temp.next;
                }


        }
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return head;
    }
}
