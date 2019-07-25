
/*----- Checking the run time of an Array using different approaches -----*/

import java.util.*; 
import java.util.concurrent.TimeUnit;


public class CalculatingRunTime {
    
   public static void main(String args[]){
        
        int arr[] = new int[(Integer.MAX_VALUE)/10000];
        
        for(int i=(Integer.MAX_VALUE)/10000; i>0; i--){
            arr[(Integer.MAX_VALUE)/10000 - i] = i; 
        }
        
        /*--- Calculating the run time for sorting using nested for loops: ---*/
        
        long timeStarts = System.currentTimeMillis();  //Time starts here
        
            for(int i=0; i<arr.length; i++){
                for(int j=i+1; j<arr.length; j++){
                    if(arr[i]>arr[j]) {
                        int bucket = arr[i];
                        arr[i] = arr[j]; 
                        arr[j] = bucket; 
                    }
                }
            }
        
        System.out.print("The sorted array in ASC order is:");
        
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        
        long timeEnds = System.currentTimeMillis();   //Time ends here
        
        long timeInSeconds = TimeUnit.MILLISECONDS.toSeconds(timeEnds - timeStarts);
        
        System.out.printf("%nThe Time taken in seconds is: "+timeInSeconds+" seconds%n");
        
        
        
        /*--- Checking run time for Array sorting using inbuilt sorting method: ---*/
        
        
        
        int arr2[] = new int[(Integer.MAX_VALUE)/10000];
        
        for(int i=(Integer.MAX_VALUE)/10000; i>0; i--){
            arr2[(Integer.MAX_VALUE)/10000 - i] = i; 
        }
        
        long timeStarts2 = System.currentTimeMillis();   //Time starts here
        
        Arrays.sort(arr2);
        
        System.out.print("The sorted array in ASC order is:");
        
        for(int i=0; i<arr2.length; i++){
            System.out.print(" "+arr2[i]);
        }
       
        long timeEnds2 = System.currentTimeMillis();   //Time ends here
        
        long timeInSeconds2 = TimeUnit.MILLISECONDS.toSeconds(timeEnds2 - timeStarts2);
        
        System.out.printf("%nThe Time taken in seconds is: "+timeInSeconds2+" seconds%n");
        
    }
   
    
}

/*
* Worst case:
*
* The Run time for for-loop came out to be: 21 seconds 
* The Run time for inbuilt sort came out to be: 1 second
*
*
*/


