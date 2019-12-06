class Loop{

    // This function will remove the loop from the linked list
    public static void removeTheLoop(Node head)
    {
        //Your code here
        if(head == null || head.next == null)
            return;

        Node slow = head;
        Node fast = head.next.next;

        while( fast != null && fast.next != null){
            if(slow == fast)
                break;
            slow = slow.next;
            fast = fast.next;
        }

        if(slow == fast){
            slow = head;
            while(slow.next != fast.next){
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null;
        }
    }
}
