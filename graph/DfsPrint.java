package graph;
import java.util.*;
public class DfsPrint {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of vertices:");
		int n=sc.nextInt();
		System.out.println("Enter no of edges:");
		int e=sc.nextInt();
		int edges[][]=new int[n][n];
		for(int i=0;i<e;i++)
		{
			int fv=sc.nextInt();
			int sv=sc.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;
		}
		print(edges);
		sc.close();
	}
	
	static void print(int[][] edges)
	{
		boolean visited[]=new boolean[edges.length];
		for(int i=0;i<edges.length;i++)
		{
			if(!visited[i])
				printHelper(edges,i,visited);
		}
		
	}
	
	static void printHelper(int[][] edges,int sv,boolean[] visited)
	{
		System.out.println(sv);
		visited[sv]=true;
		for(int i=0;i<edges.length;i++)
		{
			if(edges[sv][i]==1 && !visited[i])
				printHelper(edges,i,visited);
		}
	}
}
