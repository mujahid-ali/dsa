class GFG
{
    static Node head;
    static Node findIntersection(Node head1, Node head2)
    {
        // add your code here
        Node temp1 = head1;
        Node temp2 = head2;
        Set<Integer> one = new TreeSet<>();
        Set<Integer> two = new HashSet<>();
        while(temp1 != null){
            one.add(temp1.data);
            temp1 = temp1.next;
        }
        while(temp2 != null){
            two.add(temp2.data);
            temp2 = temp2.next;
        }
        one.retainAll(two);

        for(int x1 : one){
            //insert(x1);
            System.out.print(x1 + " ");
        }

        //one.forEach(this::insert);

        return head;
    }

    public static void insert(int data){
        System.out.print("Value of x in insert " + data);
        if(head == null){
            Node temp2 = new Node(data);
            head = temp2;
            System.out.println(" Not here again!");
            return;
        }
        System.out.println("Reached here");
        Node temp = head;
        while(temp != null){
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        //newNode.next = null;
    }
}
