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


public class EvenAfterOdd {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> oddH,oddT,evenH,evenT,temp;
        oddH=oddT=evenH=evenT=null;
        temp=head;
        while(temp!=null)
        {
            if(temp.data%2==0)
            {
                if(evenH==null)
                {
                    evenH=temp;
                    evenT=temp;
                }
                else
                {
                    evenT.next=temp;
                    evenT=temp;
                }
            }
            else
            {
                if(oddH==null)
                {
                    oddH=temp;
                    oddT=temp;
                }
                else
                {
                    oddT.next=temp;
                    oddT=temp;
                }
                    
            }
            temp=temp.next;
        }
        if(evenH==null || oddH==null)
        {
            return head;
        }
        
        evenT.next=null;
        oddT.next=null;
        head=oddH;
        oddT.next=evenH;
        return head;
	}
}
