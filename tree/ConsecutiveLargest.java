import java.util.*;
public class ConsecutiveLargest {

	public static int[] stockSpan(int[] price) {
		//Your code goes here
        Stack<Integer> stack=new Stack<>();
        int i,j;
        int[] arr=new int[price.length];
        stack.push(0);
        arr[0]=1;
        for(i=1;i<price.length;i++)
        {
            if(price[i]<=price[stack.peek()])
            {
                arr[i]=1;
                stack.push(i);
            }
                
            else
            {
                while(!stack.isEmpty())
                {
                    if(price[stack.peek()]<price[i])
                        stack.pop();
                    else
                        break;
                }
                if(stack.isEmpty())
                {
                    arr[i]=i+1;
                }  
                else
                {
                    arr[i]=i-stack.peek();
                }
                stack.push(i);
            }
        }
        return arr;
	}

}
