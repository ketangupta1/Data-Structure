//Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), find and print the path from v1 to v2 (if exists). 
// Print nothing if there is no path between v1 and v2.
// Find the path using BFS and print the shortest path available.


import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class GetPathBFS {
	public static void main(String[] args)  throws NumberFormatException, IOException{
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int[][] edges=new int[n][n];
        for(int i=0;i<e;i++)
        {
            int fv=sc.nextInt();
            int sv=sc.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int first=sc.nextInt();
        int second=sc.nextInt();
        if(first==second)
        {
            System.out.print(first+" ");
            return;
        }
        getPathBFS(edges,first,second);
	}
    
    static void getPathBFS(int[][] edges,int first,int second)
    {
        int n=edges.length;
        boolean[] visited=new boolean[n];
        int[] map=new int[n];
        for(int i=0;i<n;i++)
            map[i]=-1;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(first);
        visited[first]=true;
        for(int i=0;i<n;i++)
        {
            if(!visited[i])
            {
                getPathBFSHelper(edges,first,second,map,visited,queue);
            }
        }
    }
    
    static void getPathBFSHelper(int[][] edges, int first,int second,int[] map,boolean[] visited,Queue<Integer> queue)
    {
        
        while(!queue.isEmpty())
        {
            int data=queue.remove();
            visited[data]=true;
            for(int i=0;i<edges.length;i++)
            {
                if(edges[data][i]==1 && !visited[i])
                {
                    queue.add(i);
                    visited[i]=true;
                    map[i]=data;
                    if(i==second)
                    {
                        System.out.print(i+" ");
                        while(i!=first)
                        {
                            System.out.print(map[i]+" ");
                            i=map[i];
                        }
                        return;
                    }
                }
            }
        }
        
    }
}
