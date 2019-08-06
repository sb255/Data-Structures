/*
 * Array rotation using loops!
 */



public class ArrayRotation2 {
    
    public static void main(String args[]){
        
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] arr2 = new int[10]; 
        int rotation = 21;
        
        //If roation is greater than the length of the array
        if(rotation>arr.length)
            rotation = rotation%arr.length; 
        
            //Populate the new array with the value at the new index or the rotated index
            for(int i=0; i<arr.length; i++){
                arr2[(i+rotation)%arr.length] = arr[i]; 
            }
        
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }
    }
}

