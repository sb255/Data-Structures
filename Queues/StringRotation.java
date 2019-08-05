Alternate solution using loops: https://github.com/sb255/Data-Structures/blob/master/Arrays%20and%20Lists/ArrayRotation.java

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Left and right of the String using Queue!
 * 
 * Input: "abcde", Roation: 2 
 * Output:
 * Left Rotation: c, d, e, a, b 
 * Right Rotation: d, e, a, b, c
 *
 */

public class StringRotation {
    
    public static void main(String[] args) {

        String input = "abcde";
        Queue<Character> queue = new LinkedList<>(); //for left rotation
        Queue<Character> queueCopy = new LinkedList<>(); // for right rotation
        
        for(int i=0; i<input.length(); i++){
            queue.add(input.charAt(i));
            queueCopy.add(input.charAt(i));
        }
        
        //Current Queue and characters positioning
        System.out.println(queue);

        
        //Rotating the String to the left by 2 places
        System.out.println(leftRotation(queue, 2));
        
        //Rotating the String to right by 2 places
        System.out.println(rightRotation(queueCopy, 2));

    }
    
    static Queue leftRotation(Queue q, int rotation){
        
        Queue<Character> tempQueue = q;
        
        for(int i=0; i<rotation; i++){
            char x = tempQueue.poll(); 
            tempQueue.add(x); 
        }
        
        return tempQueue;
        
    }
    
    static Queue rightRotation(Queue q, int rotation){
        
        Queue<Character> tempQueue = q;
        int queueSize = tempQueue.size(); 
        
        for(int i=0; i<queueSize-rotation; i++){
            char x = tempQueue.poll(); 
            tempQueue.add(x); 
        }
        
        return tempQueue;
        
    }

}
