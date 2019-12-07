class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node current = node;
        Node prev = null;
        Node next = null;
        int count = 0;

        while(count < k && current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }
        if(next != null){
            node.next = reverse(next,k);
        }

        return prev;
    }
}
