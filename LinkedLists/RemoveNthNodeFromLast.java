
/*-- Removing Bth node from the bottom of a LinkedList --*/

import java.util.*;

public class RemoveNthNodeFromLast {
    
    
    
 /*------------------- Removing Bth node from the last of a LinkedList ---------------------------*/
    
    
    
    static Node removeNthFromLast(Node A, int B) {
        
        if(A.next==null)
            return null;
        
        int count = 0;
        Node n = A;
        Node AA = A; /*-- We have to always keep the reference of the Head.  --*/
        
        //We are just traversing here, not changing anything!
        while(n!=null){
            n = n.next;
            count++; 
        }
        
        int x = count-B;
        
        if(x==0)
            return AA.next; 
        
	/*-- We are not looping A(Head) beacasue otherwise we loose the pointer to the Head, 
	that's why taking the reference of A into AA and looping AA  --*/

        for(int i=1; i<x; i++){
            AA = AA.next; 
        }
        
        
        if(AA.next.next!=null)
            AA.next = AA.next.next;
        
        else
            AA.next = null; 
        
        
        return A; 
        
    }
    
 
    /*-------------------------------------------------------------------------------------------------*/
 
    
    /*-- Inputs from the main method --*/
    
    public static void main(String[] args){
        
        Node A = new Node(5);
        A.addNodeToTail(10);
        A.addNodeToTail(20);
        A.addNodeToTail(30);
        A.addNodeToTail(35);
        A.addNodeToTail(40);
        A.addNodeToTail(50);
        
        Node C = removeNthFromLast(A, 5);
        
        while(C!=null){
            System.out.println(C.data);
            C = C.next; 
        }
    
    }
    
}

/*-- Node class Implementation --*/

class Node{
    
    int data;
    Node next; 
    
    public Node(int data){
    this.data = data;
    }
    
    public void addNodeToTail(int addData){
        
        Node current = this;
        
        while(current.next!=null){
            current = current.next; 
        }
        
        current.next = new Node(addData); 
        
    }
    
}


