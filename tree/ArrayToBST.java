
/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class Node{
  int data;
  Node left;
  Node right;

  Node(int d){
    data = d;
    left = right = null;
  }
}

class GFG {
  static Node root1;
	public static void main (String[] args)throws java.lang.Exception {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t = Integer.parseInt(br.readLine());

    while(t-->0){

      int n = Integer.parseInt(br.readLine());
      String str[] = br.readLine().split(" ");
      int i =0;
      int arr[] = new int[n];
      for(i=0; i<n; i++){
        arr[i] = Integer.parseInt(str[i]);
      }
      int low = 0;
      int high = n-1;
      int mid = low+((high-low)/2) ;
      Node root = new Node(arr[mid]);

      root1 = construct_BST(arr,low,high);

      print_BSTInorder(root1);
      System.out.println();
    }
	}

  public static Node construct_BST(int arr[], int low, int high){
    if(low>high){
      return null;
    }

        int mid = low+((high-low)/2);
        Node root = new Node(arr[mid]);
        root.left = construct_BST(arr,low,mid-1);
        root.right = construct_BST(arr,mid+1,high);
        return root;
      }


  public static void print_BSTInorder(Node root){
    if(root == null)
    return;

      System.out.print(root.data + " ");
      print_BSTInorder(root.left);

      print_BSTInorder(root.right);

  }
}
