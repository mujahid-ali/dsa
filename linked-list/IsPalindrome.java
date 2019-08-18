class Palindrome
{
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head)
    {
        //Your code here
        Node temp = head;
        Stack<Integer> stack = new Stack<>();
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            if(temp.data == stack.peek()){
                stack.pop();
                temp = temp.next;
            }
            else
                break;
        }
        return stack.isEmpty();
    }
}
