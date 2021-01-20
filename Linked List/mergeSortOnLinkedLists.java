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

	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null ||head.next==null)
        {
            return head;
        }
        LinkedListNode<Integer> slow,fast,temp,mid,head1,head2,tempHead1,tempHead2,head3;
        slow=head;
        fast=head;
        temp=head;
        while(fast!=null && fast.next!=null)
        {
            if(fast.next.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            else
            {
                
                fast=fast.next;
            }
        }
        mid=slow;
        head1=head;
        head2=mid.next;
        mid.next=null;
        tempHead1=mergeSort(head1);
        tempHead2=mergeSort(head2);
        head3=merge(tempHead1,tempHead2);
        return head3;
	}
    public static LinkedListNode<Integer> mergeSortOnLinkedLists(LinkedListNode<Integer> head1,LinkedListNode<Integer> head2)
    {
        if(head1==null)
            return head1;
        if(head2==null)
            return head2;
        LinkedListNode<Integer> t1,t2,h3,t3;
        t1=head1;
        t2=head2;
        t3=null;
        h3=null;
        if(t1.data<=t2.data)
        {
            t3=t1;
            h3=t1;
            t1=t1.next;
        }
        else
        {
            t3=t2;
            h3=t2;
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
        {
            t3.next=t1;
        }
        else
            t3.next=t2;
        return h3;
    }

}
