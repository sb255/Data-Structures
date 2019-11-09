//-- PROGRAM TO COUNT THE NUMBER OF NODES IN A TREE USING RECURSION 
//-- BINARY TREE: WHERE EACH NODE CAN ATMOST HAVE 2 CHILDREN

public class CalculatingTreeHeight{

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
    
    //-- METHOD FOR CALCULATING SUM OF ALL THE NODES OF A BINARY TREE
    
    public static int sumOfNodes(TreeNode node){
    
        TreeNode currentNode = node; 
        
        if(currentNode==null)
            return 0; 
        
        else{
        
            return currentNode.data + sumOfNodes(currentNode.leftNode) + sumOfNodes(currentNode.rightNode);
            
        }
    }
    
    //-- METHOD FOR CALCULATING THE HEIGHT OF A BINARY TREE
    
    //-- HEIGHT OF A TREE: NUMBER OF EDGES BETWEEN THE ROOT NODE AND THE FURTHEST NODE FROM THE ROOT NODE   
    
    public static int heightOfTree(TreeNode node){
    
        if(node==null)
            return -1;
        
        return (1 + heightOfTree(node.leftNode))>(1 + heightOfTree(node.rightNode))?(1 + heightOfTree(node.leftNode)):(1 + heightOfTree(node.rightNode)); 
        
    }
    
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
        
        int value = heightOfTree(root);
        System.out.println("THE HEIGHT OF THE TREE IS: "+value);
        
    }
}



