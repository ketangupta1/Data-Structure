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

public class Solution {
    
    public static LinkedListNode<Integer> mergeTwoSortedLinkedLists(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        //Your code goes here
        if(head1==null)
        {
            return head2;
        }
        if(head2==null)
        {
            return head1;
        }
        LinkedListNode<Integer> t1,t2,h3,t3;
        t1=head1;
        t2=head2;
        h3=null;
        t3=null;
        if(t1.data<=t2.data)
        {
            h3=t1;
            t3=t1;
            t1=t1.next;
        }
        else
        {
            h3=t2;
            t3=t2;
            t2=t2.next;
        }
        while(t1!=null && t2!=null)
        {
            if(t1.data<=t2.data)
            {
                t3.next=t1;
                t3=t1;
                t1=t1.next;
            }
            else
            {
                t3.next=t2;
                t3=t2;
                t2=t2.next;
            }
        }
        if(t1!=null)
            t3.next=t1;
        else
            t3.next=t2;
        return h3;
    }

}
