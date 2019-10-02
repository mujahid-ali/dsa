
// Get min element from stack in (O)1 time and space( without using another stack).
//push 2*x - min and pop 2*min -x if min changes 
class GfG{
    int min;
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    if(s.isEmpty()){
	        min = a;
	        s.push(a);
	        return;
	    }
	    else{
	        if(a<min){
	            s.push( (2*a - min ) );
	            min = a;
	        }
	        else{
	            s.push(a);
	        }
	    }

	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.isEmpty()){
                return -1;
            }
            else{
                int x = s.pop();
                if(x<min){
                    min = 2*min -x;
                }
                return x;
            }
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           if(!s.isEmpty())
                return min;
            else
                return -1;
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(s.size() == n)
                return true;
            else
                return false;
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.isEmpty())
                return true;
                else
                return false;
	}
}
