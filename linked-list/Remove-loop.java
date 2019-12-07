class Loop{

    //hashing
    public static void removeTheLoop(Node head)
    {
        //Your code here
        if(head == null)
            return;
        HashSet<Node> hs = new HashSet<Node>();
        Node prev = null;
        Node temp = head;

        while(temp != null){
            if(hs.contains(temp)){
                prev.next = null;
                break;
            }
            else{
                hs.add(temp);
                prev = temp;
                temp = temp.next;
            }
        }
    }

    // This function will remove the loop from the linked list
    //Using slow and fast ptr
    public static void removeTheLoop2(Node head)
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


/*
CPP
void removeTheLoop(Node *head)
{
     //Your code here
     if(head == NULL || head->next == NULL)
            return;

        Node *slow = head;
        Node *fast = head->next->next;

        while( fast != NULL && fast->next != NULL){
            if(slow == fast)
                break;
            slow = slow->next;
            fast = fast->next;
        }

        if(slow == fast){
            slow = head;
            while(slow->next != fast->next){
                slow = slow->next;
                fast = fast->next;
            }
            fast->next = NULL;
        }
}

*/
