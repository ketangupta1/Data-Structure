// Given a positive integer 'n', find and return the minimum number of steps that 'n' has to take to get reduced to 1. You can perform any one of the following 3 steps:
// 1.) Subtract 1 from it. (n = n - 1) ,
// 2.) If its divisible by 2, divide by 2.( if n % 2 == 0, then n = n / 2 ) ,
// 3.) If its divisible by 3, divide by 3. (if n % 3 == 0, then n = n / 3 ).  
// Write brute-force recursive solution for this.




public class Solution {

	public static int countMinStepsToOne(int n) {
		//Your code goes here
        int[] storage=new int[n+1];
        for(int i=1;i<=n;i++)
            storage[i]=-1;
        return countMinStepsToOne(n,storage);
	}

    private static int countMinStepsToOne(int n, int[] storage)
    {
        if(n==1)
        {
            storage[1]=0;
            return 0;
        }
        
        int k1=Integer.MAX_VALUE,k2=Integer.MAX_VALUE,k3=Integer.MAX_VALUE;
        if(storage[n-1]==-1)
        {
            k1=countMinStepsToOne(n-1,storage)+1;
        }
        else if(storage[n-1]!=-1)
        {
            k1=storage[n-1]+1;
        }
        if(n%2==0)
        {
            if(storage[n/2]==-1)
            {
                k2=countMinStepsToOne(n/2,storage)+1;
            }
            else if(storage[n/2]!=-1)
            {
                k2=storage[n/2]+1;
            }
        }
        if(n%3==0)
        {
            if(storage[n/3]==-1)
            {
                k3=countMinStepsToOne(n/3,storage)+1;
            }
            else if(storage[n/3]!=-1)
            {
                k3=storage[n/3]+1;
            }
        }
        int k= Math.min(k1,Math.min(k2,k3));
        storage[n]=k;
        return k;
        
    }
}
