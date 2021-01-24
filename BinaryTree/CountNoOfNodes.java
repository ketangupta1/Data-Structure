public class CountNoOfNodes{
  public static int countNodes(BinaryTreeNode<Integer> root)
  {
     if(root==null)   //Base Case
        return 0;
     int num=1;
     num+=countNodes(root.left);
     num+=countNodes(root.right);
     return num;
  }
