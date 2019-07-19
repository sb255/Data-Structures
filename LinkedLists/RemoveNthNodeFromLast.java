/*-- Removing the Node number B from the end of the List!! --*/
 
public class Test {
    Node removeNthFromLast(Node A, int B) {
        
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
}

