class Queues
{
    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    /*The method pop which return the element poped out of the stack*/
    int pop()
    {
	    // Your code here
	    if(!q1.isEmpty()){
	    int res = q1.peek();
	    q1.remove();
	    return res;
	    }
	    else{
	        return -1;
	    }
    }

    /* The method push to push element into the stack */
    void push(int a)
    {
	    // Your code here
	    q2.add(a);

	    while( !q1.isEmpty()){
	        q2.add(q1.peek());
	        q1.remove();
	    }
	    Queue<Integer> q3 = q1;
	    q1 = q2;
	    q2 = q3;
    }

}
