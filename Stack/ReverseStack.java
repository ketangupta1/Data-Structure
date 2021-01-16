import java.util.*;
public class ReverseStack {

	public static void reverseStack(Stack<Integer> input, Stack<Integer> extra) {
		//Your code goes here
        if(input.size()<=1)
        {
            return;
        }
        int temp=input.pop();
        //input.pop();
        reverseStack(input,extra);
        while(!input.isEmpty())
        {
            extra.push(input.pop());
            //input.pop();
        }
        input.push(temp);
        while(!extra.isEmpty())
        {
            input.push(extra.pop());
            //extra.pop();
        }
        //System.out.println(input.pop());
	}
}
