class GfG{
	public static void zigzag(Node phead){
	    Node prev = phead;
	    Node temp = phead.next;
	    int count = 0;
	    while(temp != null){
	        if(count == 0){
	            if(temp.data < prev.data)
	                swap(temp,prev);
	           count++;
	        }
	        else{
	            if(temp.data > prev.data)
	                swap(temp,prev);
	           count--;
	        }
	        temp = temp.next;
	        prev = prev.next;
	    }
	    temp = phead;
	    while(temp != null){
	        System.out.print(temp.data + " ");
	        temp = temp.next;
	    }
	    System.out.println();

    }


    public static void swap(Node a, Node b){
        int x = a.data;
        a.data = b.data;
        b.data = x;
    }
}
