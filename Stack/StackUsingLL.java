
/*
    Following is the structure of the node class for a Singly Linked List

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

*/

public class StackUsingLL {

    //Define the data members

    Node head;
    
    public Stack() {
        //Implement the Constructor
        head=null;
    }



    /*----------------- Public Functions of Stack -----------------*/


    public int getSize() { 
        //Implement the getSize() function
        Node temp=head;
        int count=0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    public boolean isEmpty() {
        //Implement the isEmpty() function
    
        return (head==null);
    }

    public void push(int element) {
        //Implement the push(element) function
        Node temp=new Node(element);
        if(head==null)
        {
            temp.next=null;
            head=temp;
        }
        else
        {
            temp.next=head;
            head=temp;
        }
    }

    public int pop() {
        //Implement the pop() function
        if(head==null)
            return -1;
        else
        {
            Node temp=head;
            head=temp.next;
            return temp.data;
        }
       
    }

    public int top() {
        //Implement the top() function
        if(head==null)
            return -1;
        return head.data;
        
    }
}
