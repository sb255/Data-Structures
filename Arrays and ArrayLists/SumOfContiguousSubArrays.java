//-- FIND ALL THE CONTIGUOUS SUBARRAYS FROM A GIVEN ARRAY WHOSE SUM IS EQUAL TO 10 

public class Test {
    
    public static void printSubArray(int[] arrr, int start, int end){
        
        System.out.print("[ ");
        
        for(int i=start; i<end; i++){
            System.out.print(arrr[i]+" ");
        }
        
        System.out.println("]");
        
    }
    
    public static void subArrays(int[] arrr, int tip, int limit, int sum){
        
        //-- BASE CASE
        if(tip>limit){
        }
        
        else if(tip<limit){
            
            int total = 0;
        
            for(int i=tip; i<limit; i++){
                
                total = total + arrr[i]; 
                
            }
            
            if(total==sum)
                printSubArray(arrr, tip, limit);
            
            
            subArrays(arrr, tip+1, limit, sum);
            
        }
        
        //-- WHEN THE TIP AND THE LIMIT ARE EQUAL
        else{
            subArrays(arrr, 0, limit - 1, sum);
        }
        
        
    }
    
    public static void main(String[] args){
        
        //-- EXAMPLE ARRAY 
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        subArrays(arr, 0, arr.length, 10);
        
    }
}

