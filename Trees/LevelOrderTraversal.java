//-- LEVEL ORDER TRAVERSAL IN A BINARY TREE

import java.util.*; 

public class LevelOrderTraversal {
    
    //Tree class implementation for Binary Tree
    static class TreeNode{
        TreeNode left,right;
        int data;
    
        TreeNode(int data){
            this.data = data;
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
            
            System.out.println(currentNode.data);
            
        }
        
    }

    
    public static void main(String args[]){
        
     //Creating a BINARY TREE
     TreeNode root = new TreeNode(10); 
     root.left = new TreeNode(20);
     root.right = new TreeNode(30); 
     root.left.left = new TreeNode(40); 
     root.left.right = new TreeNode(50);
     root.right.left = new TreeNode(60);
     root.right.right = new TreeNode(70);
     
     //Perfoming level order traversal in the Binary Tree
     levelOrderTraversal(root);
     
    }
}
