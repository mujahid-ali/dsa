/*This is a function problem.You only need to complete the function given below*/
class GfG
{
    int minEle;
    Stack<Integer> s = new Stack<Integer>();

    Stack<Integer> s2 =  new Stack<Integer>();
    /*returns min element from stack*/
    int getMin()
    {
	// Your code here
    if(s.isEmpty() || s2.isEmpty())
      return -1;

      else{
         int x = s2.peek();
        return x;
      }
    }

    /*returns poped element from stack*/
    int pop()
    {
	// Your code here
    if(!s.isEmpty()){
        int x = s.pop();
        int y = s2.pop();

        return x;

         }
     else{
        return -1;
      }

    }
    /*push element x into the stack*/
    void push(int x)
    {
	// Your code here
    if(s.isEmpty()){
      minEle = x;
      s.push(x);
      s2.push(x);
    }
    else{
        s.push(x);
        int y = s2.pop();

        s2.push(y);

    if(x<y){
      s2.push(x);
    }
    else{
        s2.push(y);
        }

      }
    }

}
