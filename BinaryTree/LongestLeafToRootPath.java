//  Given a binary tree, return the longest path from leaf to root. Longest means, a path which contain maximum number of nodes from leaf to root.


import java.util.ArrayList;

public class LongestLeafToRootPath {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	
	public static ArrayList<Integer> longestRootToLeafPath(BinaryTreeNode<Integer> root){
		// Write your code here
        ArrayList<Integer> list=new ArrayList<>();
        if(root==null)
            return list;
        Pair temp=longestPath(root);
        return temp.list;
	}
	public static Pair longestPath(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            Pair temp=new Pair();
            return temp;
        }
        Pair Ans=new Pair();
        Pair leftChild=longestPath(root.left);
        Pair rightChild=longestPath(root.right);
        if(leftChild.list.size()==0 && rightChild.list.size()==0)
               Ans.list.add(root.data);
        else if(leftChild.height>rightChild.height)
        {
              leftChild.list.add(root.data);
              Ans.list=leftChild.list;
              leftChild.height+=1;
              Ans.height=leftChild.height;
        }   
        else
        {
            rightChild.list.add(root.data);
            Ans.list=rightChild.list;
            rightChild.height+=1;
            Ans.height=rightChild.height;
        }
        return Ans;
    }
}

class Pair{
    ArrayList<Integer> list;
    int height;
    Pair()
    {
        list=new ArrayList<>();
        height=0;
    }
}
