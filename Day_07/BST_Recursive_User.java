class BST_rec {
	BTNode root;

	  public BST_rec()
	  {
	   root=null;
	  }


	  public void insert(int d)
	  {
	     root = insert_BST(root,d);
	  }
	 

	  private BTNode insert_BST(BTNode ptr, int d)
	  {
	   if(ptr == null)
	     ptr = new BTNode(d);

	   else if(d < ptr.getData())
	     ptr.setLeft(insert_BST(ptr.getLeft(),d));

	   else if(d > ptr.getData())
	     ptr.setRight(insert_BST(ptr.getRight(),d));

	   else
	     System.out.println("\n Duplicate data...");

	   return ptr;
	  }

	  public void  preOrder()
	  {
	     visit_preOrder(root);
	  }

	  private void visit_preOrder(BTNode r)
	  {
	    if(r==null)  return;

	    System.out.println("  " +r.getData());
	    if(r.getLeft()!=null)
	     visit_preOrder(r.getLeft());
        if(r.getRight()!=null)
	     visit_preOrder(r.getRight());
	  }

	  public BTNode search(int key)
	  {
	     return BST_Search(root,key);
	  }

	  private BTNode BST_Search(BTNode r, int k)
	  {
	    if(r == null)
	    {
	       System.out.println("Key not found...\n");
	       return null;
	    }
	    else if(k < r.getData())
	      return BST_Search(r.getLeft(),k);

	    else if(k > r.getData())
	      return BST_Search(r.getRight(),k);

	    else return r;
	  }



	  public int find_min()
	  {
	    return min_BST(root);
	  }


	  private int min_BST(BTNode r)
	  {
	    if(r.getLeft()==null)
	      return r.getData();

	    return min_BST(r.getLeft());
	  }
	  
	  public void del(int d)
	  {
	    root = del_node_BST(root, d);
	  }
	  
	  private BTNode del_node_BST(BTNode root, int d)
	  {                            
	    BTNode deletable, succ;

	    if(root == null)
	    {
	      System.out.println("Empty...");
	      return null;
	    }
	    if( d < root.getData())        // delete from left subtree
	      root.setLeft(del_node_BST(root.getLeft(),d));

	    else if( d > root.getData())   // delete from right subtree
	      root.setRight(del_node_BST(root.getRight(),d));
	    
	    else
	    {
	       if(root.getLeft() != null && root.getRight() != null)
	       {
	          succ = root.getRight();
	          while(succ.getLeft()!=null)
	              succ = succ.getLeft();

	          root.setData(succ.getData());
	          root.setRight(del_node_BST(root.getRight(),succ.getData()));
	       }
	       else
	       {
	         deletable = root;
	         if(root.getLeft() != null)   // only left child
	            root = root.getLeft();
	         else if(root.getRight() != null)  // only right child
	            root = root.getRight();
	         else
	            root = null;
	         
	         deletable= null;
	       }
	     }
	     return root;
	 }//end of function



	 public int height()
	 {
	    return find_ht(root);
	 }


	 int find_ht(BTNode ptr)
	 {
	    int h_left, h_right;

	    if(ptr == null) return 0;

	    h_left = find_ht(ptr.getLeft());

	    h_right = find_ht(ptr.getRight());
	  
	    if( h_left > h_right)
	      return 1 + h_left;
	    else
	      return 1 + h_right;
	 }
	 
	 public void insert_nonrec(int d)
	 {
	   BTNode ptr, par;
	   
	   if(root == null) { root = new BTNode(d); return; }
	   ptr=root;

	   par = ptr;  
	   while(ptr!=null)
	   {
	     par = ptr;
	     if(d < ptr.getData())
	        ptr = ptr.getLeft();

	     if(d > ptr.getData())
	        ptr = ptr.getRight();

	     else
	     {
	    	System.out.println("Duplicate data...");
	        return;
	     }
	   }
	   ptr = new BTNode(d);
	   
	   if( d < par.getData())
	     par.setLeft(ptr);
	   else
	     par.setRight(ptr);

	   return;

	  }

	  public BTNode search_nonrec(int d)
	  {
	     BTNode ptr = root;
	     
	     while(ptr!=null)
	     {
	       if( d == ptr.getData())
	          return ptr;
	       else if( d < ptr.getData())
	         ptr = ptr.getLeft();
	       else ptr = ptr.getRight();
	     }

	     System.out.println("Not found...");
	     return null;
	   }


	   public int min_nonRec()
	   {
	      BTNode ptr = root;

	      if(ptr == null) { System.out.println("Tree is empty.."); return -999; }

	      while(ptr.getLeft()!=null)
	        ptr = ptr.getLeft();

	      return ptr.getData();

	   }
	   public int max_nonRec(){
		BTNode ptr =root;
		if(ptr==null){
			System.out.print("Empty.....");return -999;
		}
		while (ptr.getRight()!=null)
			ptr=ptr.getRight();
		return ptr.getData();
	   }
	   public int max_node(int d){
		return (int)Math.pow(2, d) - 1;
}
}
public class BST_Recursive_User {

	public static void main(String[] args) {
		BST_rec tree = new BST_rec();
		tree.insert(40);
		tree.insert(20);
		tree.insert(35);
		tree.insert(45);
		tree.insert(55);
		tree.insert(22);
		tree.insert(60);
		tree.insert(57);
	/*	System.out.println("min = " + tree.find_min());
		System.out.println("search 45 " + tree.search(45));
		System.out.println("search 45 = " + tree.search(45).getData());
	*/	tree.preOrder();
		tree.del(40);
		System.out.println("\n After delete...\n");
		tree.preOrder();
		System.out.println("\n heigth = " + tree.height());

		tree.insert_nonrec(72);
		System.out.println("search 72 " +tree.search_nonrec(72));
		tree.preOrder();
		System.out.println("min = " + tree.min_nonRec());
		System.out.println("max = " + tree.max_nonRec());
		System.out.println("Maximum Nodes by HEight\n"+tree.max_node(10));
	}

}
