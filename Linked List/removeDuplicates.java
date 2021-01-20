public class Solution {

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
		//Your code goes here
        LinkedListNode temp=head;
        int len=0;
        if(head==null ||head.next==null)
        {
            return head;
        }
        while(temp!=null)
        {
            len++;
            temp=temp.next;
        }
        temp=head; LinkedListNode<Integer> prev=null;
        while(temp!=null && temp.next!=null )
        {
            if(temp.data.equals(temp.next.data))
            {
                prev=temp;
                temp=temp.next;
                while(temp!=null && temp.data.equals(prev.data))   //Take care here .equals methods are used
                {
                    temp=temp.next;
                }
                prev.next=temp;
            }
            else
            temp=temp.next;
        }
        return head;
	}

}
