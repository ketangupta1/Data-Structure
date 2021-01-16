/* 

    Following is the class used to represent the Node of a Singly Linked List

    class Node<T> {
        public T data;
        public Node<T> next;

        public Node(T data) {
            this.setData(data);
            this.next = null;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
*/

public class DeleteAlternateNode {

    public static void deleteAlternateNodes(Node<Integer> head) {
        //Your code goes here
        int size=0;
        Node temp=head;
        while(head!=null && head.next!=null )
        {
            if(size%2!=0)
            {
                Node t=head.next;
                head.next=t.next;
                head=t.next;
            }
            size++;
        }
    }
}
