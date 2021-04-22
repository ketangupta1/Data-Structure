import java.util.*;

public class DijkastraAlgo {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int v = s.nextInt();
		int e = s.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
        int[][]edges=new int[v][v];
        for(int i=0;i<e;i++)
        {
            int fv=s.nextInt();
            int sv=s.nextInt();
            int weight=s.nextInt();
            edges[fv][sv]=weight;
            edges[sv][fv]=weight;
        }
        dijkstra(edges);
	}
    
    static void dijkstra(int[][] edges)
    {
        int v=edges.length;
        int distance[] =new int[v];
        boolean visited[]=new boolean[v];
        distance[0]=0;
        for(int i=1;i<v;i++)
            distance[i]=Integer.MAX_VALUE;
        for(int i=0;i<v-1;i++)
        {
            int minVertex=findMinVertex(visited,distance);
            visited[minVertex]=true;
            for(int j=0;j<v;j++)
            {
                if(!visited[j] && edges[minVertex][j]!=0 )
                {
                    if(distance[minVertex]+edges[minVertex][j]<distance[j])
                    {
                        distance[j]=distance[minVertex]+edges[minVertex][j];
                    }
                }
            }
        }
        for(int i=0;i<v;i++)
        {
            System.out.println(i+" "+distance[i]);
        }
    }
    static int findMinVertex(boolean[] visited,int[] distance)
    {
        int minVertex=-1;
        for(int i=0;i<distance.length;i++)
        {
            if(!visited[i] && (minVertex==-1 || distance[minVertex]>distance[i]))
                minVertex=i;
        }
        return minVertex;
    }
}
