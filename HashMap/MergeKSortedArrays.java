import java.util.*;
public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int k=0;
        for(int i=0;i<input.size();i++)
        {
            for(int j=0;j<input.get(i).size();j++)
            {
                pq.add(input.get(i).get(j));
                k++;
            }
                
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int j=0;j<k;j++)
        {
            list.add(pq.remove());
        }
        return list;
	}

}
