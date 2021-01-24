//In a given Generic Tree, replace each node with its depth value. You need to just update the data of each node, no need to return or print anything.

public class ReplaceWithDepthValue {

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
	
	public static void replaceWithDepthValue(TreeNode<Integer> root){

        if(root==null)
            return;
		// Write your code here
		replaceWithDepthValue(root,0);
	}
	public static void replaceWithDepthValue(TreeNode<Integer> root,int depth)
    {
        if(root.children.size()==0)
        {
            root.data=depth;
        }
        for(int i=0;i<root.children.size();i++)
        {
            replaceWithDepthValue(root.children.get(i),depth+1);
            root.data=depth;
        }
    }
	
}
