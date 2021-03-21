import java.util.*;
public class CheckMaxHeap {

	public static boolean checkMaxHeap(int arr[]) {
		/*
		 * Your class should be named Solution Don't write main(). Don't read input, it
		 * is passed as function argument. Return output and don't print it. Taking
		 * input and printing output is handled automatically.
		 */
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        for(int i=0;i<arr.length;i++)
        {
            int temp=pq.remove();
            if(temp!=arr[i])
                return false;
        }
        return true;
	}
}
