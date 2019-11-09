//-- PROGRAM TO COUNT THE NUMBER OF NODES IN A TREE USING RECURSION 
//-- BINARY TREE: WHERE EACH NODE CAN ATMOST HAVE 2 CHILDREN

public class Test{

    //-- CREATING A TREE NODE CLASS
    public static class TreeNode{
        TreeNode leftNode, rightNode;
        int data;
        
        TreeNode(int data){
            this.data = data;
            leftNode = null;
            rightNode = null;
        }
    }
    
    //--METHOD FOR COUNTING THE NUMBER OF NODES IN A BINARY TREE
    
    public static int totalNodes(TreeNode node){
        
        TreeNode currentNode = node;
        int counter = 1;
        
        if(currentNode==null)
            return 0; 
        
        else{
            
            return counter + totalNodes(currentNode.leftNode) + totalNodes(currentNode.rightNode);
            
        }
            
    }
      
    /*
    
    WORKING OF THE RECURSION STACK!
    
    return value of the function totalNodes = 
    
    1 + totalNodes(20) + totalNodes(30) 
             |                |
             |                V
             |     1 + totalNodes(60) + totalNodes(70)
             |               |               |
             |               |               |
             |               V               |
             |               1               |
             |                               V
             |                     1 + totalNodes(100) + totalNodes(110)
             |                              |                |
             |                              |                |
             |                              V                V
             |                              1                1
             |
             |
             |
             |      
             V
    1 + totalNodes(40) + totalNodes(50)
             |                |
             |                V
             |                1 
             |                 
             |                 
             |                 
             |                 
             V                 
    1 + totalNodes(80) + totalNodes(90)
             |                 |
             |                 |
             |                 |
             |                 V
             |                 1    
             |                 
             V                 
             1                 
                               
                               
                               

The sum will be 11.
            
 */
    
    public static void main(String[] args){
        
        //-- POPULATING THE BINARY TREE
        
        TreeNode root = new TreeNode(10);
        root.leftNode = new TreeNode(20);
        root.rightNode = new TreeNode(30);
        root.leftNode.leftNode = new TreeNode(40);
        root.leftNode.rightNode = new TreeNode(50);
        root.rightNode.leftNode = new TreeNode(60);
        root.rightNode.rightNode = new TreeNode(70);
        root.leftNode.leftNode.leftNode = new TreeNode(80);
        root.leftNode.leftNode.rightNode = new TreeNode(90);
        root.rightNode.rightNode.leftNode = new TreeNode(100);
        root.rightNode.rightNode.rightNode = new TreeNode(110);
        
        int value = totalNodes(root);
        System.out.println("THE TOTAL NUMBER OF THE NODES IN THE TREE ARE: "+value);
        
    }
}



