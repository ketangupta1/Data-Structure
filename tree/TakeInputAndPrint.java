package tree;
import java.util.*;
public class TakeInputAndPrint {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeNode<Integer> root=takeInput(sc);
		print(root);
		sc.close();
	}
	
	
	static TreeNode<Integer> takeInput(Scanner s)
	{
		int n;
		System.out.println("Enter the value of Node: ");
		n=s.nextInt();
		TreeNode<Integer> root=new TreeNode<>(n);
		System.out.println("Enter the no of children of "+n);
		int childCount=s.nextInt();
		for(int i=0;i<childCount;i++)
		{
			TreeNode<Integer> child=takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	static void print(TreeNode<Integer> root)
	{
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++)
		{
			s+=root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int j=0;j<root.children.size();j++)
		{
			print(root.children.get(j));
		}
		
	}
}




class TreeNode <T>{
	T data;
	ArrayList<TreeNode<T>> children;
	TreeNode(T data)
	{
		this.data=data;
		children=new ArrayList<>();
	}
}
