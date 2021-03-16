import java.util.*;

public class kLargestElem {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> list=new ArrayList<>();
		int i=0;
        for(;i<k;i++)
        {
            pq.add(input[i]);
        }
        for(;i<input.length;i++)
        {
            int elem=pq.element();
            if(input[i]>elem)
            {
                pq.remove();
                pq.add(input[i]);
            }
        }
        for(int j=0;j<k;j++)
        {
            list.add(pq.remove());
        }
        return list;
	}
}
