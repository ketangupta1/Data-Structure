public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        int[] storage=new int[n+1];
        storage[1]=0;
        for(int i=2;i<=n;i++)
        {
            int k1=Integer.MAX_VALUE,k2=Integer.MAX_VALUE,k3=Integer.MAX_VALUE;
            k1=storage[i-1]+1;
            if(i%2==0)
            {
                k2=storage[i/2]+1;
            }
            if(i%3==0)
            {
                k3=storage[i/3]+1;
            }
           
            storage[i]=Math.min(k1,Math.min(k2,k3));
        }
        return storage[n];
	}

}
