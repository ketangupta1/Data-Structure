// Given a binary tree, write code to create a separate linked list for each level. You need to return the array which contains head of each level linked list.  Sample Input 1:
// 5 6 10 2 3 -1 -1 -1 -1 -1 9 -1 -1
// Sample Output 1:
// 5 
// 6 10 
// 2 3 
// 9


import java.util.*;

public class LevelWiseLinkedList {
	/*
	 * BinaryTreeNode class
	 * 
	 * class BinaryTreeNode<T> 
	 * { 
	 * 		T data; 
	 * 		BinaryTreeNode<T> left; 
	 * 		BinaryTreeNode<T> right;
	 *		public BinaryTreeNode(T data) 
	 *		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	/*
	 * LinkedListNode Class
	 * class LinkedListNode<T> 
	 * { 
	 * 		T data; 
	 * 		LinkedListNode<T> next;
	 * 		public LinkedListNode(T data) 	
	 * 		{
	 *  		this.data = data; 
	 *  	} 
	 *  }
	 */
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinaryTreeNode<Integer> root){
		// Write your code here
        if(root==null)
            return null;
        ArrayList<LinkedListNode<Integer>> output=new ArrayList<LinkedListNode<Integer>>();
        LinkedListNode<Integer> head,tail;
        head=tail=null;
        BinaryTreeNode<Integer> cur;
        Queue<BinaryTreeNode<Integer>> q=new LinkedList<>();
        BinaryTreeNode<Integer> nullNode=new BinaryTreeNode<>(Integer.MIN_VALUE);
        q.add(root);
        q.add(nullNode);
        while(q.size()!=1)
        {
            cur=q.poll();
            if(cur==null);
            else if(cur==nullNode)
            {
                output.add(head);
                head=tail=null;
                q.add(nullNode);
            }
            else
            {
                LinkedListNode<Integer> n=new LinkedListNode<Integer>(cur.data);
                if(head==null)
                {
                    head=n;
                    tail=n;
                }
                else
                {
                    tail.next=n;
                    tail=n;
                }
                q.add(cur.left);
                q.add(cur.right);
            }
        }
        return output;
	}

}
