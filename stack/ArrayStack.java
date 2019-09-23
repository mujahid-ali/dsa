
class MyStack{
  int top;
  int arr[] = new int[1000];
  MyStack(){
    top = -1;
  }

  boolean isFull(){
    return top == arr.length - 1;
  }

  boolean isEmpty(){
    return top == -1;
  }

  void push(int a){
    if(!isFull()){
      arr[++top] = a;
    }
    else{
      System.out.println("Overflow");
    }
  }

  int pop(){
    if(!isEmpty()){
      return arr[top--];
    }
    else{
      return -1;
    }
  }
}
