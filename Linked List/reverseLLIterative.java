/*************** 
     * Following is the Node class already written 
            class LinkedListNode<T> {
                T data;
                LinkedListNode<T> next;

                public Node(T data) {
                    this.data = data;
                }
            }
 ***************/

public class Solution {

	public static LinkedListNode<Integer> reverseLLIterative(LinkedListNode<Integer> head){
        
        /* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        LinkedListNode<Integer> temp,cur,prev;
        if(head==null ||head.next==null)
        {
            return head;
        }
        temp=head;
        prev=null;
        while(temp!=null)
        {
            cur=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cur;
        }
        return prev;
	}
}
