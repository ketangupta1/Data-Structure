public class CompairTwotreeIdenticalOrNot {

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
	
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
        if(root1==null ||root2==null)
            return false;
        if(root1.children.size()==0 &&root2.children.size()==0)
        {
            if(root1.data!=root2.data)
                return false;
            else
                return true;
        }
        if(root1.children.size()!=root2.children.size())
            return false;
        for(int i=0;i<root1.children.size();i++)
        {
            boolean small=checkIdentical(root1.children.get(i),root2.children.get(i));
            if(small==true && root1.data==root2.data)
                return true;
            else
                return false;
        }
        return false;
	}
	
}
