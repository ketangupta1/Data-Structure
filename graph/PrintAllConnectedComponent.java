// Given an undirected graph G(V,E), find and print all the connected components of the given graph G.
// Print different components in new line. And each component should be printed in increasing order of vertices (separated by space). 
// Order of different components doesn't matter.


import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class PrintAllConnectedComponent {

	public static void main(String[] args) throws NumberFormatException, IOException {
        
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        if(e==0)
        {
            for(int j=0;j<n;j++)
                System.out.println(j);
            return;
        }
        int[][] edges=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv=sc.nextInt();
            int sv=sc.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        connectedComponent(edges);
	}
    
    static void connectedComponent(int[][] edges)
    {
        boolean[] visited=new boolean[edges.length];
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
            {
                Queue<Integer> queue =new LinkedList<>();
                queue.add(i);
                visited[i]=true;
                ArrayList<Integer> list=new ArrayList<>();
                list.add(i);
                connectedComponentHelper(edges,visited,queue,list);
                Collections.sort(list);
                for(int j=0;j<list.size();j++)
                    System.out.print(list.get(j)+" ");
                System.out.println();
            }
                
        }
    }
    
    static void connectedComponentHelper(int[][] edges,boolean[] visited,Queue<Integer> queue,ArrayList<Integer> list)
    {
        while(!queue.isEmpty())
        {
            int data=queue.remove();
            for(int i=0;i<edges.length;i++)
            {
                if(edges[data][i]==1 && !visited[i])
                {
                    list.add(i);
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        
        
    }
    

}
