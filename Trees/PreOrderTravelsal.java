/*-- PreOrderTravelsal/DepthFirstSearch without Recursion --*/

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
    public ArrayList<Integer> preorderTraversal(Node A) {
                        
        ArrayList<Integer> list = new ArrayList<>(); 
        
        Stack<Node> stack = new Stack<>(); 
        
        stack.push(A); 
        
        while(!stack.empty()){
            
            Node node = stack.pop(); 
            list.add(node.dValue); 
            
            if(node.right!=null)
                stack.push(node.right); 
                
            if(node.left!=null)
                stack.push(node.left); 
        }
        
        return list; 
        
    }
}

