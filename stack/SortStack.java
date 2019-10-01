
class GfG{
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
    Stack<Integer> stack2 = new Stack<Integer>();

    while(!s.isEmpty()){

      int temp = s.pop();

      while( !stack2.isEmpty() && stack2.peek()>temp){
        s.push(stack2.pop());
      }
      stack2.push(temp);
    }
    return stack2;
	}
}
