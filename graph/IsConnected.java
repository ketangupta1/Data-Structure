import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class IsConnected {

	public static void main(String[] args) throws NumberFormatException, IOException {
       
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        if(n==0 && e==0)
        {
            System.out.println("true");
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
        isConnected(edges);
	}
    
    static void isConnected(int[][] edges)
    {
        boolean[] visited=new boolean[edges.length];
        Queue<Integer> queue=new LinkedList<>();
        int sv=0; 
        queue.add(sv);
        visited[sv]=true;
        isConnectedHelper(edges,visited,sv,queue);
    }
    
    static void isConnectedHelper(int[][] edges,boolean[] visited,int sv,Queue<Integer> queue)
    {
        while(!queue.isEmpty())
        {
            int data=queue.remove();
            for(int i=0;i<edges.length;i++)
            {
                if(edges[data][i]==1 && !visited[i])
                {
                    queue.add(i);
                    visited[i]=true;
                }
            }
        }
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
            {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");  
    }

}
