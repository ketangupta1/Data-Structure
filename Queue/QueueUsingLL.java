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

public class QueueUsingLL {
	
	//Define the data members

    int size;
    Node front,rear;

	public Queue() {
		//Implement the Constructor
        size=0;
        front=null;
        rear=null;
	}
	


	/*----------------- Public Functions of Stack -----------------*/


	public int getSize() { 
		//Implement the getSize() function
        return size;
    }


    public boolean isEmpty() { 
    	//Implement the isEmpty() function
        return size==0;
    }


    public void enqueue(int data) {
    	//Implement the enqueue(element) function
        Node temp=new Node(data);
        if(front==null)
        {
            front=rear=temp;
        }
        else
        {
            rear.next=temp;
            rear=temp;
        }
        
        size++;
    }


    public int dequeue() {
    	//Implement the dequeue() function
        if(size==0)
            return -1;
        Node temp=front;
        front=front.next;
        size--;
        return temp.data;
        
    }


    public int front() {
    	//Implement the front() function
        if(size==0)
            return -1;
        return front.data;
    }
}
