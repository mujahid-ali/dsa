class GfG
{
    // Function to remove duplicates from the given linked list
    Node removeDuplicates(Node head)
    {
         // Your code here
         //int arr[] = new int[50];
         List<Integer> arr = new ArrayList<>();
         Node temp = head.next;
         Node prev = head;
         arr.add(prev.data);
         while(temp != null){
             if(arr.contains(temp.data)){
                 prev.next = temp.next;
                 temp = temp.next;
             }
             else{
                 //arr[i++] = temp.data;
                 arr.add(temp.data);
                 prev = temp;
                 temp = temp.next;
             }
         }
         return head;
    }
}
