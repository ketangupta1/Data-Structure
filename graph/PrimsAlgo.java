import java.util.*;

public class PrimsAlgo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        int edges[][]=new int[v][v];
        for(int i=0;i<e;i++)
        {
            int fv=s.nextInt();
            int sv=s.nextInt();
            int weight=s.nextInt();
            edges[fv][sv]=weight;
            edges[sv][fv]=weight;
        }
        prims(edges);
	}
    
    static void prims(int[][] edges)
    {
        int v=edges.length;
        int[] weight=new int[v];
        boolean[] visited=new boolean[v];
        int[] parent=new int[v];
        parent[0]=-1;
        weight[0]=0;
        for(int i=1;i<v;i++)
        {
            weight[i]=Integer.MAX_VALUE;
        } 
        for(int i=0;i<v;i++)
        {
            int minVertex=findMinVertex(visited,weight);
            visited[minVertex]=true;
            for(int j=0;j<v;j++)
            {
                if(!visited[j] && edges[minVertex][j]!=0)
                {
                    if(edges[minVertex][j]<weight[j])
                    {
                        weight[j]=edges[minVertex][j];
                        parent[j]=minVertex;
                    }
                }
            }
        }
        for(int i=1;i<v;i++)
        {
            if(i>parent[i])
                System.out.println(parent[i]+" "+i+" "+weight[i]);
            else
                System.out.println(i+" "+parent[i]+" "+weight[i]);
        }
    }
    static int findMinVertex(boolean[] visited,int[] weight)
    {
        int minVertex=-1;
        for(int i=0;i<weight.length;i++)
        {
            if(!visited[i] && (minVertex==-1 || weight[i]<weight[minVertex]) )
                minVertex=i;
        }
        return minVertex;
    }
}
