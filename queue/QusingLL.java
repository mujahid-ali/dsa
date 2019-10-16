/*The structure of the node of the queue is
class QueueNode
{
	int data;
	QueueNode next;
	QueueNode(int a)
	{
	    data = a;
	    next = null;
	}
}*/
class MyQueue
{
    QueueNode front, rear;

    // This function should add an item at
    // rear
	void push(int a)
	{
        // Your code here
        if(front == null){
        QueueNode temp = new QueueNode(a);
        rear = temp;
        front = temp;
        }
        else{
        QueueNode temp = new QueueNode(a);
        rear.next = temp;
        rear = temp;
        }

	}

    // This function should remove front
    // item from queue and should return
    // the removed item.
	int pop()
	{
        // Your code here
        if(front == null)
            return -1;
        else{
            QueueNode temp = front;
            int x = front.data;
            front = front.next;
            temp.next = null;
            return x;
        }

	}
}
