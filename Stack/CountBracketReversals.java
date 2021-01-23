import java.util.*;
public class CountBracketReversals {

	public static int countBracketReversals(String input) {
		//Your code goes here
        char[] ch=input.toCharArray();
        char c1,c2;
        int count=0;
        Stack<Character> stack=new Stack<>();
        if(ch.length%2 != 0)
            return -1;
        for(char c : ch)
        {
            if(c=='{')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    stack.push(c);
                }
                else
                {
                    if(stack.peek()=='}')
                        stack.push(c);
                    else
                        stack.pop();
                }
            }
        }
        while(!stack.isEmpty())
        {
            c1=stack.pop();
            c2=stack.pop();
            if(c1==c2)
            {
                count+=1;
            }
            else
                count+=2;
        }
        return count;
	}
    
}
