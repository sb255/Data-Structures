import java.util.*; 

class TreeNode{
    TreeNode left,right;
    int dValue;
    
    TreeNode(int v){
        dValue = v;
        left = null;
        right = null;
    }
}


public class TreeHeight {
   public static int getTreeHeight(TreeNode root){
      
        int height1= 0, height2 = 0; 

        TreeNode currentNode = root; 

        if(currentNode==null)
            return 0;
            
        height1 = getTreeHeight(currentNode.left);  
        height2 = getTreeHeight(currentNode.right); 

        //Adding 1 for height of the node!
        return height1>height2?(height1+1):(height2+1); 

    }
    
    public static void main(String args[]){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30); 
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        root.right.left = new TreeNode(60);
        root.right.right = new TreeNode(70);
        
        System.out.println("The Height of the Tree is: "+getTreeHeight(root));
    }
}
