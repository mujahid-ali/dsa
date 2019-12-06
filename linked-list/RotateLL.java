
class Rotate {

     /*  This function should rotate list counter-
    clockwise by k and return new head (if changed) */
    public Node rotate(Node head, int k) {
        // add code here.

        if(head == null || k == 0){
            return head;
        }
        Node temp = head;
        int n = 1;//number of nodes

        while(n<k && temp != null){
            n++;
            temp = temp.next;
        }
        if(k>n || temp == null)
            return head;

        Node prev = temp;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        head = prev.next;
        prev.next = null;

        return head;


    }
}
