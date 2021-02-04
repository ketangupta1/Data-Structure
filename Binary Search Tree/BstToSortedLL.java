public class Solution {

	/*
	 * Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> { T data; BinaryTreeNode<T> left; BinaryTreeNode<T>
	 * right;
	 * 
	 * public BinaryTreeNode(T data) { this.data = data; } }
	 */

	/*
	 * LinkedList Node Class
	 *
	 * 
	 * class LinkedListNode<T> { T data; LinkedListNode<T> next;
	 * 
	 * public LinkedListNode(T data) { this.data = data; } }
	 */

	public static LinkedListNode<Integer> constructLinkedList(BinaryTreeNode<Integer> root) {

        Pair temp=constructLinkedListP(root);
        return temp.head;
	}
    
    public static Pair constructLinkedListP(BinaryTreeNode<Integer> root)
    {
        if (root==null)
        {
            Pair temp=new Pair();
            temp.head=temp.tail=null;
            return temp;
        }
        Pair leftChild,rightChild;
        Pair ans=new Pair();
        ans.head=ans.tail=null;
        LinkedListNode<Integer> head,tail;
        leftChild=constructLinkedListP(root.left);
        rightChild=constructLinkedListP(root.right);
        LinkedListNode<Integer> cur=new LinkedListNode<>(root.data);
        if(leftChild.head!=null)
        {
            
            ans.head=leftChild.head;
            leftChild.tail.next=cur;
        }
        else
            ans.head=cur;
        if(rightChild.head!=null)
        {
            cur.next=rightChild.head;
            ans.tail=rightChild.tail;
        }
        else
            ans.tail=cur;
              
        return ans;
    }
}

class Pair
{
    LinkedListNode<Integer> head,tail;
}
