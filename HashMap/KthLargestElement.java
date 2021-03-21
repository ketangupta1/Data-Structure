import java.util.*;
public class Solution {

	public static int kthLargest(int n, int[] input, int k) {
		// Write your code here

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++)
            pq.add(input[i]);
        for(int i=0;i<k-1;i++)
        {
            pq.remove();
        }
        return pq.remove();
	}
}
