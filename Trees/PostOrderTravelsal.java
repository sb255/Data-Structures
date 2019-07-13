/*-- Post Order Travelsal in a Tree --*/

public class Test {
    public ArrayList<Integer> postorderTraversal(Node A) {
        
        ArrayList<Integer> list = new ArrayList<>(); 
        Stack<Node> stack = new Stack<>(); 
        Stack<Integer> stackReverse = new Stack<>(); 
    
        stack.push(A);
    
        while(!stack.empty()){
            
            Node node = stack.peek();
            int data = stack.pop().val; 
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

