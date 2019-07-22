
/*-- Printing the elements of a LinkedList in reverse order using Stack --*/

import java.util.*;

public class Test {
    
    /*-- Printing in reverse all the elements of a LinkedList --*/
    
    static void printInReverse(Node head) {

        Node n = head;
        Stack<Integer> stack = new Stack<>();

        if(head.next==null)
            System.out.println(n.data);

        while(n.next!=null){
            stack.push(n.data);
            n = n.next;
        }

        stack.push(n.data);

        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }

    }
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(5);
        A.next = new Node(10);
        A.next.next = new Node(20);
        A.next.next.next = new Node(30);
        
        printInReverse(A);
    
    }
    
}

/*-- Node class Implementation --*/

class Node{
    
    int data;
    Node next; 
    
    public Node(int data){
    this.data = data;
    }
    
}


