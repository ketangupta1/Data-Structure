package stack;

public class stackUsingArray{

	public static void main(String[] args)
	{
		stack st=new stack(3);
		for(int i=0;i<10;i++)
		{
			st.push(i+1);
		}
		for(int i=0;i<10;i++)
		{
			try {
				System.out.println(st.pop());
			}
			catch(StackEmptyException e)
			{
				//Never reach here
			}
			
		}
	}
	
	
}

class stack{
	private int[] data;
	private int top;
	stack()
	{
		data=new int[10];
		top=-1;
	}
	
	
	stack(int n)
	{
		data=new int[n];
		top=-1;
	}
	
	
	public int size()
	{
		return top+1;
	}
	
	
	public boolean isEmpty()
	{
//		if(size()==0)
//			return true;
//		else
//			return false;
		return (top==-1);
	}
	
	
	public int top() throws StackEmptyException{
		if(size()==0)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		return data[top];
	}
	
	public void push(int elem)
	{
		if(size()==data.length)
			doubleCapacity();
		top++;
		data[top]=elem;
	}
	
	public void doubleCapacity()
	{
		int[] temp=data;
		data=new int[2*data.length];
		for(int i=0;i<temp.length;i++)
		{
			data[i]=temp[i];
		}
	}
	
	
	public int pop() throws StackEmptyException
	{
		if(size()>data.length)
		{
			StackEmptyException e=new StackEmptyException();
			throw e;
		}
		int temp=data[top];
		top--;
		return temp;
	}
}

class StackFullException extends Exception {
	private static final long serialVersionUID=1L;
}


class StackEmptyException extends Exception {
	private static final long serialVersionUID=1L;
}
