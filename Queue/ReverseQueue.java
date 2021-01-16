import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {

	public static void reverseQueue(Queue<Integer> input) {
		//Your code goes here
        if(input.size()==0 || input.size()==1)
        {
            return;
        }
        int temp=input.poll();
        reverseQueue(input);
        input.add(temp);
	}

}
