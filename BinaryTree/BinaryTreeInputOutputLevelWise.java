package binaryTree;
import java.util.*;

class BinaryTreeNode<T> {

	T data;
	BinaryTreeNode<T> left,right;
	BinaryTreeNode(T data)
	{
		this.data=data;
	}
	
}



public class BinaryTreeInputOutputLevelWise {

	public static void main(String args[])
	{
		BinaryTreeNode<Integer> root=takeInput();
		printOutput(root);
	}
	public static BinaryTreeNode<Integer> takeInput()
	{
		Queue<BinaryTreeNode<Integer>> queue=new LinkedList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter root data:");
		int rootData=sc.nextInt();
		if(rootData==-1)
			return null;
		BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode<Integer> front=queue.poll();
			System.out.println("Enter left child of "+front.data+":");
			int leftData=sc.nextInt();
			if(leftData!=-1)
			{
				BinaryTreeNode<Integer> left=new BinaryTreeNode<>(leftData);
				front.left=left;
				queue.add(left);
			}
			System.out.println("Enter right child of "+front.data+":");
			int rightData=sc.nextInt();
			if(rightData!=-1)
			{
				BinaryTreeNode<Integer> right=new BinaryTreeNode<>(rightData);
				front.right=right;
				queue.add(right);
			}
		}
		return root;
	}
	
	public static void printOutput(BinaryTreeNode<Integer> root)
	{
		if(root==null)
			return;
		Queue<BinaryTreeNode<Integer>> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty())
		{
			BinaryTreeNode<Integer> front=queue.poll();
			System.out.print(front.data+": ");
			if(front.left!=null)
			{
				queue.add(front.left);
				System.out.print("L-"+front.left.data+",");
			}
			if(front.right!=null)
			{
				queue.add(front.right);
				System.out.print("R-"+front.right.data);
			}
			System.out.println();
		}
	}
}
