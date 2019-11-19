
import java.util.LinkedList;
import java.util.Queue;


//-- POPULATING A BINARY SEARCH TREE!!

public class PopulateBST{
    
    static class TreeNode{
    TreeNode left,right;
    int dValue;

    TreeNode(int v){
        dValue = v;
        left = null;
        right = null;
    }
}
    
    public static void levelOrderTraversal(TreeNode root){
        
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root); 
        
        while(!nodeQueue.isEmpty()){
            
            TreeNode currentNode = nodeQueue.poll();  
            
            if(currentNode.left!=null)
                nodeQueue.add(currentNode.left);
            
            if(currentNode.right!=null)
                nodeQueue.add(currentNode.right);
            
            System.out.println(currentNode.dValue);
            
        }
        
    }
    
    //-- POPULATING THE BINARY SEARCH TREE USING THE METHOD populateBST
    public static void populateBST(TreeNode root, TreeNode addNode){
    
        if(addNode.dValue<root.dValue){
        
            if(root.left==null)
                root.left = addNode; 
            
            else
                populateBST(root.left, addNode);
        }
        
        else if(addNode.dValue>root.dValue){
        
            if(root.right==null)
                root.right = addNode; 
            
            else
                populateBST(root.right, addNode);
        }
        
        else{
            //DO NOTHING
        }
    
    }

    public static void main(String[] args){
    
        TreeNode root = new TreeNode(50);
 
        populateBST(root, new TreeNode(10));
        populateBST(root, new TreeNode(20));
        populateBST(root, new TreeNode(30));
        populateBST(root, new TreeNode(40));
        populateBST(root, new TreeNode(50));
        populateBST(root, new TreeNode(60));
        populateBST(root, new TreeNode(70));
        populateBST(root, new TreeNode(80));
        populateBST(root, new TreeNode(90));
  
        //Level Order Traversal in the above Tree
        levelOrderTraversal(root);
        
    
    }
}
