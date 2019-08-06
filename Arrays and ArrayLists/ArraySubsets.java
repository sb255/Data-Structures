/*
 * 
 * Finding all the sub arrays of an array. Inefficient approach, needs another optimized solution!
 * 
 */


public class ArraySubsets {
    
    static void subsetsOfArray(int[] arr){
        
        for(int k=0; k<arr.length; k++){
            for(int i=0; i<arr.length; i++){
               for(int j=k; j<arr.length-i; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.printf("%n");
            }
        }
        
        
    }
    
    
    public static void main(String args[]){
        int[] array = {1,2,3,4,5}; 
        subsetsOfArray(array);
    }
    
}

