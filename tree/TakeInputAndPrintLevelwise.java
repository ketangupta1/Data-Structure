package tree;
import java.util.*;
public class TakeInputAndPrintLevelwise {

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
		//System.out.println(root.data);
		queue.add(root);

		System.out.print(root.data+",");
		while(!queue.isEmpty())
		{
			TreeNode<Integer> temp=queue.poll();
			for(int i=0;i<temp.children.size();i++)
			{
				queue.add(temp.children.get(i));
			}
			for(int i=0;i<temp.children.size();i++)
			{
				System.out.print(temp.children.get(i).data+",");
			}
		}
	}
}