public class AppendLastNToFirst {

	public static LinkedListNode<Integer> appendLastNToFirst(LinkedListNode<Integer> head, int n) {
		//Your code goes here
        int i=0,count=0;
        LinkedListNode temp=head;
        if(n==0)
        {
            return head;
        }
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
        temp=head;
        while(i!=count-n-1 && temp!=null)
        {
            i++;
            temp=temp.next;
        }
        LinkedListNode<Integer> temp1,prev;
        temp1=null;prev=null;
        if(temp!=null && temp.next!=null )
        {
            prev=temp;
            temp=temp.next;
            temp1=temp;
            prev.next=null;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=head;
        }
        
        return temp1;
	}

    
}
