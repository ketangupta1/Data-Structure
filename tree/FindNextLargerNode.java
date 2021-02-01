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
		
        if(root==null)
            return root;
        TreeNode<Integer> ans,temp;
        
        if(root.data<=n)
            ans=null;
        else
            ans=root;
        for(int i=0;i<root.children.size();i++)
        {
            temp=findNextLargerNode(root.children.get(i),n);
            if(ans==null)
                ans=temp;
            else if(temp==null);
            else if(temp.data<ans.data)
                ans.data=temp.data;
        }
        return ans;
	}
	
}
