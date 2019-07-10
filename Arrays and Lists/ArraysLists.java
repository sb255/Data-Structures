/*When we want to compare two list' objects, we use the following method: */

static List<Integer> compareLists(List<Integer> a, List<Integer> b) {

        List<Integer> list1 = new ArrayList<Integer>();
        list1 = a;  

        List<Integer> list2 = new ArrayList<Integer>();
        list2 = b; 

        /* This line is tricky*/
 
        /*
        Integer[] arr1 = new Integer[list1.size];
        arr1 = list1.toArray(); 
        The above two lines can be merged and can be written as:
        Integer[] arr1 = list1.toArray(new Integer[list1.size()]);
        
        */

        Integer[] arr1 = list1.toArray(new Integer[list1.size()]);

        Integer[] arr2 = list2.toArray(new Integer[list2.size()]);

        int aaa=0;
        int bbb=0; 

        for(int i=0; i<list1.size(); i++){
            
            if(arr1[i]==arr2[i]) 
            {}

            else if(arr1[i]>arr2[i])
            aaa++;

            else if(arr1[i]<arr2[i])
            bbb++; 
        }

        List<Integer> arrFinal = new ArrayList<Integer>();
        arrFinal.add(aaa);
        arrFinal.add(bbb);


        return arrFinal;

}
