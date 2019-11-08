//-- PRINTING ALL THE CONTIGUOUS SUB ARRAYS OF AN ARRAY USING RECURSION  

public class Test {
    
    public static void subArrays(int[] arrr, int tip, int limit){
       
	//-- BASE CASE 
        if(tip>limit){
        }
        
        else if(tip<limit){
        
            for(int i=tip; i<limit; i++){
                System.out.print(arrr[i]+" ");
            }
            
            System.out.println(" ");
        
            subArrays(arrr, tip+1, limit);
            
        }
        
        //-- WHEN THE TIP AND THE LIMIT ARE EQUAL
        else{
            subArrays(arrr, 0, limit - 1);
        }
        
        
    }
    
    public static void main(String[] args){
        
        //-- EXAMPLE ARRAY 
        int[] arr = {1,2,3,4,5,6,7};
        subArrays(arr, 0, arr.length);
        
    }
}

