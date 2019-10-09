
/* Implement queue using Stack
*/
class StackQueue
{
    Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
    /* The method insert to push element
       into the queue */
    void insert(int B)
    {
	   // Your code here
	   s1.push(B);
    }


    /* The method remove which return the
      element popped out of the queue*/
    int remove()
    {
	   // Your code here
	   if(s1.isEmpty() && s2.isEmpty())
	        return -1;
	   if(s2.isEmpty()){
	       while(!s1.isEmpty()){
	           s2.push(s1.pop());
	       }
	   }
	    return s2.pop();
    }
}
