/*----- Post Order Travelsal in a Tree -----*/

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
    public ArrayList<Integer> postorderTraversal(Node A) {
        
        ArrayList<Integer> list = new ArrayList<>(); 
        Stack<Node> stack = new Stack<>(); 
        Stack<Integer> stackReverse = new Stack<>(); 
    
        stack.push(A);
    
        while(!stack.empty()){
            
            Node node = stack.peek();
            int data = stack.pop().dValue; 
            stackReverse.push(data);
            
            if(node.left!=null)
                stack.push(node.left);
            
            if(node.right!=null)
                stack.push(node.right);
                
        }
        
        while(!stackReverse.empty()){
            list.add(stackReverse.pop()); 
        }
        
        
        return list;        
    }
}

