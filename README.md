# Data-Structures!

<h2> Data Structure Topics:  </h2>

   * [Arrays and Lists](https://github.com/sb255/SB255-Arrays-DS)
   * Linked List
   * [Stacks and Queues](https://github.com/sb255/SB255-Stacks-Queues-DS)
   * Hash Tables and Hashing
   * [Sets](https://github.com/sb255/SB255-Sets-DS)
   * [Maps](https://github.com/sb255/SB255-Maps-DS)
   * Tree Data Structure
   * Trie Data Structure
   * Graph Data Structure

# *Arrays and Lists:* 

## Most Basic types of array declaration:

type var-name [10];

OR

type[10] var-name; 


(Generally second type of declaration is preffered)

------------------------------------------------------------------------------------------------------------------------------

## Initializing an array


int[] intArray = new int[10] 

OR

int[] intArray = {0,1,2,3,4,5,6,7,8,9}


------------------------------------------------------------------------------------------------------------------------------

## Most common methods to find the size or length of an array

arr.length -> for calculating the length of all types of array (int[], String[], char[]) 

arr.size() -> for calculating the size of an object array(Ex. List array as it stores only objects)

---------------------------------------------------------------------------------------------

## Point to remember

.length -> It is used for calculating the length of all types of array (int[], String[], char[])

.length() -> It is used for calculating the length of a String

------------------------------------------------------------------------------------------------------------------------------

## Arrays and Lists declarations:  

```
/*---- General ways of creating int and String arrays ----*/
        
        
int[] intArray1 = new int[10];                /*-- Array size should be provided --*/                             
        
int[] intArray2 = {0,1,2,3,4,5,6,7,8,9};      /*-- Also a valid declaration --*/
        
int intArray3[] = new int[10];                /*-- Another valid declaration --*/
        
int intArray4[] = {0,1,2,3,4,5,6,7,8,9};      /*-- Another valid declaration --*/
        
String[] stringArray1 = new String[5];
        
String[] stringArray2 = {"Hello", "Hello", "Hello", "Hello", "Hello"};
        

        
        
/*---- Creating Lists for Integer objects ----*/

        
List<Integer> list1 = new ArrayList<Integer>();                 /*-- Empty List, List size not required --*/
        
List<Integer> list2 = new ArrayList<>();                        /*-- Valid declaration, List size not required --*/
        
List<Integer> list3 = new ArrayList<Integer>(new Integer(100)); /*-- Integer object 100 as first element --*/
        
List<Integer> list4 = new ArrayList<>(new Integer(120));        /*-- Integer object 120 as first element --*/
        
List<Integer> list5 = new ArrayList<Integer>(130);              /*-- Integer object 130 as first element --*/
        
        
        
        
/*---- Creating Lists for String objects ----*/
        
/*-- We use Arrays.asList(String[] s) and (listName).toArray(String[] s) for dealing with Lists and String arrays--*/

        
List<String> list6 = new ArrayList<String>(Arrays.asList(new String("Hello"))); /*-- Valid declaration for String --*/
        
List<String> list7 = new ArrayList<>(Arrays.asList(new String("Hello")));       /*-- Valid declaration for String --*/
        
List<String> list8 = new ArrayList<> (Arrays.asList("Hello", "Hi"));            /*-- Adding two elements in the list --*/
        
List<String> list9 = new ArrayList<> (Arrays.asList(stringArray2));             /*-- Passing a String array in the asList method --*/       
        
        
/*---- Referencing ----*/

        
int[] intArray5 = new int[10];     
         
int[] intArray6 = intArray5;             /*-- Such referencing can be seen inside methods --*/ 
        
List<String> list10 = new ArrayList<>();
        
List<String> list11 = list10;             /*-- Such referencing can be seen inside methods --*/

```

---------------------------------------------------------------------------------------------
</br>

## Converting List objects into int[] (until Java 7): 

```
public class Test {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
    
        int[] intArray = new int[list.size()];
        
        for(int i=0; i<list.size(); i++){
            
            intArray[i] = list.get(i); /* Auto-unboxing from Integer -> int */
  
        }

    }
    
}

/*---NOTE---*/: Just use (listName).get(int i) to get the elements from a list and then add it to int[]

```

</br>

## Converting List objects into int[] (Java 8):

```
public class Test {

    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<Integer>(); 
        list.add(1); 
        list.add(2); 
        
        int[] intArray = list.stream().mapToInt(i->i).toArray(); 
           
    }
    
}
```

</br>

## Converting int[] into List objects:

```
public class Test {

    public static void main(String[] args) {
        
        int[] intArray = {1,2,3,4,5,6,7}; 
        
        List<Integer> list = new ArrayList<Integer>(); 
        
        for(int i : intArray){
        
            list.add(i);   /* Auto-boxing from int -> Integer */
                
        }
           
    }
    
}

/*---NOTE---*/: Just use (listName).add(Integer i) to add elements to the list from int[]

```

</br>

## Converting List objects into String[]:

```
public class Test {

    public static void main(String[] args) {
        
        List<String> list = new ArrayList<String>(); 
        list.add("Item 1"); 
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4"); 
        
        String[] stringArray = new String[list.size()];
        stringArray = list.toArray(stringArray);        /*------NOTICE------*/
         
        }
    
}

/*---Note 1---*/: Remember that we always use (listName).toArray(String[] s) for coverting a List into String[] </br>
/*---Note 2---*/: (listName).toArray(String[] s) will return a String[] so use: String[] s(or s') = (listName).toArray(String[] s)
```

</br>

## Converting String[] into List objects:

```
Also notice how we are printing the elements from the list using loops

public class Test {

    public static void main(String[] args) {
        
        String[] stringArray = {"Hello", "Hi", "Whats up"};
        List<String> list = Arrays.asList(stringArray);    /*------NOTICE------*/ 
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i)); 
        }
        
        /* Enhanced for loop can also be used for printing the elements of the list */
        for(String s : list){
            System.out.println(s);
        }
         
    }
    
}


/*---NOTE 1---*/: Remember we will use Arrays.asList(String[] s) for converting a String[] into a List objects </br>
/*---NOTE 2---*/: Arrays.asList(String[] s) will return a List of String objects, so use: List<String> list = Arrays.asList(String[] s)

```
</br>

## Overview of char[] and Charcacter list (Optional read): 

```
public class Test {
    
    public static void main(String[] args){
        
        String name = "A Character String"; 
        /*---- Note: char is a data type and Character is the wrapper class ----*/
        char[] nameArray = name.toCharArray(); /*---- Character Array Declaration ----*/

        
        List<Character> list = new ArrayList<>(); /*---- List of Character objects ----*/
        list.add('a');
        list.add('b'); 
        
        StringBuilder sb = new StringBuilder(); 
        
        /*-- Now adding elements to String Builder from Character list--*/
        /*--- NOTE: This method for priting elements works for Integers, Strings and Character lists---*/
        for(char ch : list){
            sb.append(ch); 
        }
        
    }
 
}
```

```

/*----NOTE: Method used for calculating the length of the array in the following: ----*/
    
    int[]                  -> array.length
    char[]                 -> array.length
    String[]               -> array.length
    List<Wrapper Class>    -> list.size() 
    
    
/*----NOTE: Method used for printing values from all types of list: Integer, Character or String----*/
    
    for(int i : IntegerList){}
    for(char c : CharacterList){}
    for(String s : StringList){}

```

</br>

## Two Dimensional (2D) Array declaration: 

```
public class Test {

    /*Create a 2D ArrayList and print its values*/
   
    /*    Both are valid declarations:
    
          ArrayList<ArrayList<Integer>> list = new ArrayList<>();
          ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();  
    
    */
    
    public static void main(String[] args){
    
            ArrayList<ArrayList<Integer>> rows = new ArrayList<>();
            
            for(int i=0; i<5; i++){
                ArrayList<Integer> row = new ArrayList<>();
                for(int j=0; j<5; j++){
                    row.add(j*j); 
                }
                rows.add(row); 
            }
            
            for(int i=0; i<5; i++){
                for(int j=0; j<5; j++){
                    System.out.print(rows.get(i).get(j)+" ");
                }
                System.out.println("");
            }

    }
    
}

```

---------------------------------------------------------------------------------------------

# *Sets:*

HashSet, TreeSet and LinkedHashSet also uses concept of Hashing like Maps for storing the data but **It does not contains duplicate values!!**

* HashSet - Stores the added values in the random order without duplicates.
* TreeSet - Stores the added values in the naturally ordered way without duplicates.
* LinkedHashSet - Stores the added values in the order of insertion without duplicates.

Let's see the working of a HashSet, TreeSet and a LinkedHashSet: 

```
Input: ssssbbbeedddd
```

```
Desired Output: sbed
```

## Implementation of a HashSet: 

```
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new HashSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: bsde
```

## Implementation of a TreeSet: 

```
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new TreeSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: bdes
```

## Implementation of a LinkedHashSet: 

```
public class Test {
	
    static String input = "ssssbbbeedddd";
	
	public static void main(String[] args) {
            
        Set<Character> hm = new LinkedHashSet<Character>();
            
            for(int i=0; i<input.length(); i++){
                
                hm.add(input.charAt(i));
                
            }
            
            Iterator<Character> it = hm.iterator();
            
            while(it.hasNext()){
                System.out.print(it.next());
            }
            
	}

}
```


```
Output: sbed
```

---------------------------------------------------------------------------------------------

