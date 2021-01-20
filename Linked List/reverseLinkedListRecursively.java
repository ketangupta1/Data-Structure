/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/
//1st Approach:- TC: O(n^2)
public class Solution {

	public static LinkedListNode<Integer> reverseLinkedListRecursively(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> finalHead=reverseLinkedListRec(head.next);
        LinkedListNode<Integer> temp=finalHead;
        while(temp.next!=null)
            temp=temp.next;
        temp.next=head;
        head.next=null;
        return finalHead;
        
	}

}

//2nd Approach:- TC: O(n)

public static LinkedListNode<Integer> reverseLinkedListRR(LinkedListNode<Integer> head)
{
   if(head==null ||head.next==null)
      return head;
   LinkedListNode<Integer> smallHead,reversedTail;
   reversedTail=head.next;
   smallHead=reverseLinkedListRR(head.ext);
   reversedTail.next=head;
   head.next=null;
   return smallHead;
 }
   
   
//LL is reversed recursively
