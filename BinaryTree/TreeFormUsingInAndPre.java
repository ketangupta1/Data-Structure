/*
	
	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

*/

public class TreeFormUsingInAndPre {

	public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder) {
		//Your code goes here
        BinaryTreeNode<Integer> temp=buildTree(preOrder,inOrder,0,preOrder.length-1,0,inOrder.length-1);
        return temp;
	}

    public static BinaryTreeNode<Integer> buildTree(int[] preOrder, int[] inOrder,int preS,int preE,int inS,int inE)
    {
        if(preS>preE)
            return null;
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(preOrder[preS]);
        int rootIndex=-1;
        for(int i=inS;i<=inE;i++)
        {
            if(preOrder[preS]==inOrder[i])
            {
                rootIndex=i;
                break;
            }
        }
        int leftInS=inS;
        int leftInE=rootIndex-1;
        int leftPreS=preS+1;    
        int leftPreE=leftInE-leftInS+leftPreS;      // leftInE-leftInS=leftPreE-leftPreS;
        int rightInS=rootIndex+1;
        int rightInE=inE;
        int rightPreS=leftPreE+1;
        int rightPreE=preE;
        root.left=buildTree(preOrder,inOrder,leftPreS,leftPreE,leftInS,leftInE);
        root.right=buildTree(preOrder,inOrder,rightPreS,rightPreE,rightInS,rightInE);
        return root;
    }
}
