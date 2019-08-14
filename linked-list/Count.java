
class CountNodes{
    public int getCount(Node head){

        //Code here
    int count=0;
    Node ptr = head;
    while(ptr != null){
        count++;
        ptr = ptr.next;
        }
    return count;
    }

}
