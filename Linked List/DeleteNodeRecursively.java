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

public class DeleteNodeRecursively {


	public static LinkedListNode<Integer> deleteNodeRec(LinkedListNode<Integer> head, int pos) {
    	//Your code goes here
        if(head==null)
            return head;
        if(pos==0)
        {
            return head.next;
        }
        LinkedListNode<Integer> temp=deleteNodeRec(head.next,--pos);
        head.next=temp;
        return head;
	}

}
