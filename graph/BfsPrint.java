import java.util.LinkedList;
import java.util.Queue;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class BfsPrint {

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
        print(edges);
	}
    
    static void print(int[][] edges)
    {
        boolean[] visited=new boolean[edges.length];
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<edges.length;i++)
        {
            if(!visited[i])
            {
                queue.add(i);
                visited[i]=true;
                printHelper(edges,i,visited,queue);
            }
        }
    }
    
    static void printHelper(int[][] edges, int sv, boolean[] visited, Queue<Integer> queue)
    {
        while(!queue.isEmpty())
        {
            int data=queue.remove();
            System.out.print(data+" ");
            for(int i=0;i<edges.length;i++)
            {
                if(edges[data][i]==1 && !visited[i])
                {
                    queue.add(i);
                    visited[i]=true;
                }  
            }
        }
    }

}
