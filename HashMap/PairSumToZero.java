import java.util.*;

public class PairSumToZero {
	public static int PairSum(int[] input, int size) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0,n;
        for(int i=0;i<size;i++)
        {
            if(map.containsKey(input[i]))
            {
                int t=map.get(input[i]);
                t++;
                map.put(input[i],t);
            }
            else
                map.put(input[i],1);
        }
        for(int i=0;i<size;i++)
        {
            n=map.get(input[i]);
            if(input[i]==0)
            {
                count+=(n)*(n-1)/2;
                map.put(input[i],0);
                
            }
            else if(map.get(input[i])==0);
            else
            {
                if(map.containsKey(0-input[i]))
                {
                    count+=map.get(input[i])*map.get(0-input[i]);
                }
                map.put(input[i],0);
            }
        }
        return count;
	}
}
