package queue;

public class queueUsingArray {

	public static void main(String args[])
	{
		queue q=new queue(3);
		System.out.println(q.isEmpty());
		for(int i=0;i<5;i++)
			q.enqueue(i+10);
		System.out.println(q.isEmpty());
		while(q.size()!=0)
			System.out.print(q.dequeue()+" ");
		System.out.println();
		System.out.println(q.isEmpty());
	}
}


class queue{
	int data[];
	int front,rear,size;
	queue()
	{
		data=new int[10];
		front=rear=-1;
		size=0;
	}
	queue(int n)
	{
		data=new int[n];
		front=rear=-1;
		size=0;
	}
	int size()
	{
		return size;
	}
	boolean isEmpty()
	{
		return size==0;
	}
	
	int front()
	{
		if(size==0)
			return -1;
		return data[front];
	}
	
	void enqueue(int elem)
	{
		if(size==data.length)
			doubleSize();
		if(size==0)
		{
			front=0;
		}
		
		rear=(rear+1)%data.length;  //This line is the short form of below commented code
//		rear++;
//		if(rear==data.length)
//		{
//			rear=0;
//		}
		data[rear]=elem;
		size++;
	}
	
	void doubleSize()
	{
		int temp[]=data;
		int index=0,i;
		data=new int[2*temp.length];
		for(i=front;i<temp.length;i++)
		{
			data[index]=temp[i];
			index++;
		}
		for(i=0;i<front;i++)
		{
			data[index]=temp[i];
			index++;
		}
		front=0;rear=temp.length-1;
	}
	
	
	int dequeue()
	{
		if(size==0)
			return-1;
		int temp=data[front];
		
		front=(front+1)%data.length;
//		front++;
//		if(front==data.length)
//			front=0;
		size--;
		if(size==0)
		{
			front=-1;
			rear=-1;
		}
		return temp;
	}
}
