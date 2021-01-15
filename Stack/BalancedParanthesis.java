
import java.util.Stack;
public class BalancedParanthesis {

    public static boolean isBalanced(String expression) {
        //Your code goes here
        int len=0,i,j;
        if(expression.charAt(0)==')' || expression.charAt(0)=='}' || expression.charAt(0)==']')
            return false;
        Stack<Character> s=new Stack<>();
        len=expression.length();
        for(i=0;i<len;i++)
        {
            char c=expression.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                s.push(c);
            if(c==')')
            {
                if(s.peek()=='(')
                    s.pop();
                else
                    return false;
            }
            else if(c=='}')
            {
                if(s.peek()=='}')
                    s.pop();
                else
                    return false;
            }
            else if(c==']')
            {
                if(s.peek()==']')
                    s.pop();
                else
                    return false;
            }
        }
        if(s.isEmpty())
            return true;
        else 
            return false;
    }
}
