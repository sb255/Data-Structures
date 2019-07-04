   int getTreeHeight(Node root){
      
        int height1= 0, height2 = 0; 

        Node n = root; 

        if(root==null)
            return -1;
            
        if(root.right==null && root.left==null)
            return 0;  

        height1 = 1 + getHeight(root.left);  
        height2 = 1 + getHeight(root.right); 

        return height1>height2?height1:height2; 

    }
