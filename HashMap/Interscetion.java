import java.util.*;
public class Intersection {

	public static void intersection(int[] arr1, int[] arr2) {
	    //Your code goes here
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int n1=arr1.length,n2=arr2.length,cur1=0,cur2=0;
        while(cur1<n1 && cur2<n2)
        {
            if(arr1[cur1]>arr2[cur2])
            {
                cur2++;
            }
            else if(arr1[cur1]<arr2[cur2])
            {
                cur1++;
            }
            else if(arr1[cur1]==arr2[cur2])
            {
                System.out.print(arr1[cur1]+" ");
                cur1++;
                cur2++;
            }
        }
	}

}

