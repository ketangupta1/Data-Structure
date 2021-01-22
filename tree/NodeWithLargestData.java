public class NodeWithLargestData{
  public static int largest(TreeNode<Integer> root)
  {
     if(root==null)
        return Integer.MIN_VALUE;
     int Ans=root.data();
     for(int i=0;i<root.children.size();i++0
     {
         int childLargest=largest(root.children.get(i));
         if(Ans<childLargest)
            Ans=childLargest;
     }
     return Ans;
  }
