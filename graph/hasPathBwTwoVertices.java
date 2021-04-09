// Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not.
// Print true if the path exists and false otherwise.


import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;
public class hasPathBwTwoVertices {

	public static void main(String[] args) throws NumberFormatException, IOException {
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
        find(edges,first,second);
	}
    
    static void find(int[][] edges,int first,int second)
    {
        boolean visited[]=new boolean[edges.length];
        int sv=first;
        Queue<Integer> queue=new LinkedList<>();
        queue.add(sv);
        visited[sv]=true;
        findHelper(edges,sv,second,visited,queue);
    }
    
    static void findHelper(int[][] edges, int sv,int second,boolean[] visited,Queue<Integer> queue)
    {
        while(!queue.isEmpty())
        {
            int data=queue.remove();
            for(int i=0;i<edges.length;i++)
            {
                if(edges[data][i]==1 && !visited[i])
                {
                    if(i==second)
                    {
                        System.out.print("true");
                        return;
                    }
                        
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        System.out.print("false");
    }

}
