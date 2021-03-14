import java.util.*;
public class kSortedArray{
  public static void sortKSorted(int arr[],int k)
  {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int i=0;
    for(;i<k;i++)
      pq.add(arr[i]);
    for(;i<arr.length;i++)
    {
      arr[i-k]=pq.remove();
      pq.add(arr[i]);
    }
    for(int j=arr.length-k;j<arr.length;j++)
      arr[j]=pq.remove();
 }
