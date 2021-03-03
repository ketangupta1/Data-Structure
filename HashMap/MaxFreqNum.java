// You are given an array of integers that contain numbers in random order. Write a program to find and return the number which occurs the maximum times in the given input.
//  If two or more elements contend for the maximum frequency, return the element which occurs in the array first.

import java.util.*;
public class Solution {

    public static int maxFrequencyNumber(int[] arr){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        HashMap<Integer,Integer> map=new HashMap<>();
        int Max=Integer.MIN_VALUE,key=0;
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                int n=map.get(arr[i]);
                n+=1;
                map.put(arr[i],n);
            }
            else
            {
                map.put(arr[i],1);
            }
        }
	for(int i=0;i<arr.length;i++){
            if(Max<map.get(arr[i])){
                Max=map.get(arr[i]);
                key=arr[i];
	    }
        }
        return key;
    }
}

