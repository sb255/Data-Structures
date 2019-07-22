/*----- Calculating height of a Tree -----*/

import java.util.*; 

class Node{
    Node left,right;
    int dValue;
    
    Node(int v){
        dValue = v;
        left = null;
        right = null;
    }
}


public class Test {
   public static int getTreeHeight(Node root){
      
        int height1= 0, height2 = 0; 

        Node n = root; 

        if(root==null)
            return -1;
            
        if(root.right==null && root.left==null)
            return 0;  

        height1 = 1 + getTreeHeight(root.left);  
        height2 = 1 + getTreeHeight(root.right); 

        return height1>height2?height1:height2; 

    }
    
    public static void main(String args[]){
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30); 
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.left = new Node(60);
        root.right.right = new Node(70);
        
        System.out.println("The Height of the Tree is: "+getTreeHeight(root));
    }
}

