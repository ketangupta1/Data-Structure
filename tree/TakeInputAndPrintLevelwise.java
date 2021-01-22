package tree;
import java.util.*;
public class TakeInputLevelwise {

	public static void main(String args[])
	{
		TreeNode<Integer> temp=takeInputLevelwise();
		print(temp);
	}
	
	public static TreeNode<Integer> takeInputLevelwise()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of root: ");
		int n=sc.nextInt();
		Queue<TreeNode<Integer>> queue=new LinkedList<>();
		TreeNode<Integer> root=new TreeNode<>(n);
		queue.add(root);
		while(!queue.isEmpty())
		{
			TreeNode<Integer> temp=queue.poll();
			System.out.println("Enter the no of child of "+temp.data+":");
			int childCount=sc.nextInt();
			for(int i=0;i<childCount;i++)
			{
				System.out.println("Enter the "+(i+1)+"th child of "+temp.data);
				int data=sc.nextInt();
				TreeNode<Integer> child=new TreeNode(data);
				temp.children.add(child);
				queue.add(child);
			}
		}
		return root;
	}
	
	static void print(TreeNode<Integer> root)
	{
		Queue<TreeNode<Integer>> queue=new LinkedList<>();
		System.out.println(root.data);
		queue.add(root);
		TreeNode<Integer> nullNode=new TreeNode<Integer>(Integer.MIN_VALUE);   //Adding this to know the level of tree.After the completion of each level a nullNode is added to the queue to know the where my level is completed.
		queue.add(nullNode);
		while(queue.size()!=1)
		{
			TreeNode<Integer> temp=queue.poll();
			if(temp==nullNode)
				System.out.println();
			for(int i=0;i<temp.children.size();i++)
			{
				queue.add(temp.children.get(i));
				System.out.print(temp.children.get(i).data+",");
			}
		}
	}

}
