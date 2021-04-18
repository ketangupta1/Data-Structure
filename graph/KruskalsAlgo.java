import java.util.Scanner;
import java.util.*;
public class KruskalsAlgo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int V = sc.nextInt();
		int E = sc.nextInt();
        Edge[] input=new Edge[E];
        int[] parent=new int[V];
        for(int i=0;i<V;i++)
            parent[i]=i;
        for(int i=0;i<E;i++)
        {
            input[i]=new Edge();
            input[i].source=sc.nextInt();
            input[i].dest=sc.nextInt();
            input[i].weight=sc.nextInt();
        }
        Edge[] output=new Edge[V-1];
        Arrays.sort(input);
        int count=0,i=0;
        while(count!=V-1)
        {
            int s=input[i].source;
            int d=input[i].dest;
            int w=input[i].weight;
            int p1=findParent(parent,s);
            int p2=findParent(parent,d);
            if(p1!=p2)
            {
                output[count]=input[i];
                count++;
                parent[p2]=p1;
            }
            i++;
        }
        for(int j=0;j<V-1;j++)
        {
            if(output[j].source<output[j].dest)
                System.out.println(output[j].source+" "+output[j].dest+" "+output[j].weight);
            else
                System.out.println(output[j].dest+" "+output[j].source+" "+output[j].weight);
        }
	}
    
     
    public static int findParent(int[] parent,int ver)
    {
        while(ver!=parent[ver])
        {
            ver=parent[ver];
        }
        return ver;
    }
}


class Edge implements Comparable<Edge>
{
    int source,dest,weight;
    
    public int compareTo(Edge o){
      return this.weight-o.weight;
    }
}
