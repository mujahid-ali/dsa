class MyQueue {
    int front, rear;
	int arr[] = new int[1000];
    MyQueue()
	{
		front=0;
		rear=0;
	}

	/* The method push to push element
	   into the queue */
	void push(int a)
	{
	    // Your code here
	    rear = (rear + 1) % arr.length;
	    if(rear == front){
	        return; //queuekoverflow;
	    }
	    if(rear == 0){
	        rear = arr.length-1;
	    }
	    arr[rear] = a;

	}
    /* The method pop which return the
       element poped out of the queue*/
	int pop()
	{
		// Your code here
		if(rear == front){
		    return -1;
		}
		else{
		    front = (front + 1) % arr.length;
		    int a = arr[front];
		    return a;
		}

	}
}
