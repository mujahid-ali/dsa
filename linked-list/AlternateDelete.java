{

/*package whatever //do not write package name here */
import java.io.*;
import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data){
        this.data = data;
    }
}
class GFG {

	public static void po(Object o){
	    System.out.println(o);
	}

	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){

		    Node head1 = null,tail1 = null;

		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();
		    head1 = new Node(d1);
		    tail1 = head1;

		    while(n1-- > 1){
		        tail1.next = new Node(sc.nextInt());
		        tail1 = tail1.next;
		    }

		    Solution obj = new Solution();
		    obj.deleteAlternate(head1);
		    System.out.println();
		}
	}
}

}
/*This is a function problem.You only need to complete the function given below*/

class Solution {

    public void deleteAlternate (Node head){
        //Write your code here
        Node ptr = head;
        Node prev = head;
        while(ptr!= null && ptr.next !=null){
            ptr = ptr.next;
            prev.next = ptr.next;
            prev = ptr;
            ptr = ptr.next;
            prev.next = null;
            prev = ptr;
            //prev = ptr.next;
            //prev.next = null;
            //ptr.next = ptr.next.next;
        }
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }
}
