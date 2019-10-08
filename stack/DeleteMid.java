
//Delete middle element of a stack
class Geeks
{
    //Complete this function
    public Stack<Integer> deleteMid(Stack<Integer>s,int sizeOfStack,int current)
    {
        //Your code here
        Stack<Integer> stack2 = new Stack<Integer>();
        double sizeOfStack1 = sizeOfStack/(2.0);
        sizeOfStack1 = Math.ceil(sizeOfStack1);
        int size2 = (int)sizeOfStack1;
        int temp_size = size2;

        if(sizeOfStack == 1){
            return s;
        }

        if(sizeOfStack%2 !=0){

        while( !s.isEmpty() && size2-- >1){
          int temp = s.pop();
          stack2.push(temp);
        }

        if(!s.isEmpty()){
          s.pop();
        }

        while( !stack2.isEmpty()){
          int temp = stack2.pop();
          s.push(temp);
        }

        return s;

        }else{
        while( !s.isEmpty() && size2-- >0){
          int temp = s.pop();
          stack2.push(temp);
        }

        if(!s.isEmpty()){
          s.pop();
        }

        while( !stack2.isEmpty() ){
          int temp = stack2.pop();
          s.push(temp);
        }

        return s;

        }

    }
}
