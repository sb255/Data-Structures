/*
 * Array Rotaion using Loops.
 * Alternate solution using Queues: https://github.com/sb255/Data-Structures/blob/master/Queues/StringRotation.java 
 */


public class ArrayRotation {
    
    public static void main(String args[]){
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10]; 
        int rotation = 5;
        
        //If roation is greater than the length of the array
        if(rotation>arr.length)
            rotation = rotation%arr.length; 
        
            for(int i=0; i<arr.length; i++){
                arr2[i] = arr[(i + arr.length - rotation) % arr.length]; 
            }
        
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

