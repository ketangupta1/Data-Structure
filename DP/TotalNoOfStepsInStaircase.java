// A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count 
// and return all possible ways in which the child can run-up to the stairs.


public class Solution {

	public static long staircase(int n) {
		//Your code goes here
        long[] storage=new long[n+1];
        storage[1]=1;
        storage[0]=1;
        for(int i=2;i<=n;i++)
        {
            long k1=0,k2=0,k3=0;
            k1=storage[i-1];
            if(i-2>=0)
            {
                k2=storage[i-2];
            }
            if(i-3>=0)
                k3=storage[i-3];
            storage[i]=k1+k2+k3;
        }
        return storage[n];
	}

}
