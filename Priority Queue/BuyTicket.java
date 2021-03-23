\* \\ You want to buy a ticket for a well-known concert which is happening in your city. But the number of tickets available is limited. Hence the sponsors of the concert decided to sell tickets to customers based on some priority. 
\\ A queue is maintained for buying the tickets and every person is attached with a priority (an integer, 1 being the lowest priority).
\\ The tickets are sold in the following manner -
\\ 1. The first person (pi) in the queue requests for the ticket.
\\ 2. If there is another person present in the queue who has higher priority than pi, then ask pi to move at end of the queue without giving him the ticket.
\\ 3. Otherwise, give him the ticket (and don't make him stand in queue again).
\\ Giving a ticket to a person takes exactly 1 minute and it takes no time for removing and adding a person to the queue. And you can assume that no new person joins the queue.
\\ Given a list of priorities of N persons standing in the queue and the index of your priority (indexing starts from 0). Find and return the time it will take until you get the ticket.*/



import java.util.*;
public class BuyTicket {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/

        int i,count=0,elem,elem1,n=input.length;
        Queue<Integer> queue=new LinkedList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(i=0;i<n;i++)
            queue.add(i);
        for(i=0;i<n;i++)
            pq.add(input[i]);
        while(true)
        {
            elem=input[queue.peek()];
            elem1=pq.peek();
            if(elem==elem1)
            {
                if(k==queue.peek())
                {
                    count++;
                    return count;
                }
                else
                {
                    queue.poll();
                    pq.remove();
                    count++;
                }
                
            }
            else if(elem<elem1)
            {
                elem=queue.poll();
                queue.add(elem);
            }
        }
	}
}
