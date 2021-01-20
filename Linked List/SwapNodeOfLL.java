
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
import java.util.*;
public class Solution {

	public static LinkedListNode<Integer> swapNodes(LinkedListNode<Integer> head, int i, int j) {
		//Your code goes here
        if(head==null || head.next==null)
            return head;
        LinkedListNode<Integer> temp,cur1,cur2,temp1=null,temp2=null,prev1,prev2;
        int size=0,m,n;
        temp=head;
         m=i;n=j;
        
        if(Math.abs(m-n)==1 && (i==0 || j==0))
        {
            temp2=temp.next.next;
            head=head.next;
            temp.next=temp2;
            head.next=temp;
        }
        else if((i==0 || j==0) && Math.abs(m-n)!=1)
        {
            cur1=temp;temp1=cur1.next;
            while(m-->1 || n-->1)
                temp=temp.next;
            prev2=temp;
            cur2=temp.next;
            temp2=cur2.next;
            head=cur2;
            cur2.next=temp1;
            prev2.next=cur1;
            cur1.next=temp2;
        }
        else if(Math.abs(m-n)==1)
        {
            while(m-- >1 && n-- >1)
            {
                temp=temp.next;
            }
            prev1=temp;
            cur1=temp.next;
            cur2=cur1.next;
            temp2=cur2.next;
            prev1.next=cur2;
            cur2.next=cur1;
            cur1.next=temp2;
        }
        
        else
        {
           
            while(m-- >1)
            {
                temp=temp.next;
                size++;
            }    
            prev1=temp;
            cur1=temp.next;
            if(temp.next!=null)
              temp1=cur1.next;
        temp=head;
            while(n-- >1)
            {
                temp=temp.next;
                size++;
            }
            prev2=temp;
            cur2=temp.next;
            if(temp.next!=null)
                temp2=cur2.next;
            prev1.next=cur2;
            cur2.next=temp1;
            prev2.next=cur1;
            cur1.next=temp2;
        }
        
        return head;
	}

}


// }
