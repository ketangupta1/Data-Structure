//Given a generic tree and an integer n. Find and return the node with next larger element in the Tree i.e. find a node with value just greater than n.
public class FindNextLargerNode {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here

        pair temp=findNextLargestNode(root,n);
        return temp.node;
	}
	
    public static pair findNextLargestNode(TreeNode<Integer> root, int n)
    {
        pair temp=new pair();
        temp.node=root;
        if(root.data-n<=0)
            temp.diff=Integer.MAX_VALUE;
        else
            temp.diff=root.data-n;
        for(int i=0;i<root.children.size();i++)
        {
            pair child=findNextLargestNode(root.children.get(i),n);
            if(child.diff<temp.diff)
            {
                temp=child;
            }
        }
        return temp;
    }
}

class pair{
    int diff;
    TreeNode<Integer> node;
}
