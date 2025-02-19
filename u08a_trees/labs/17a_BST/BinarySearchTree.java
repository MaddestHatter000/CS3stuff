//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

//You'll need to supply any missing import statements:
import static java.lang.System.*;

import java.util.LinkedList;
import java.util.Queue;


public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	@SuppressWarnings("unchecked")
	private TreeNode add(Comparable val, TreeNode tree)
	{
		if(tree == null)
			return new TreeNode(val, null, null);
		if(val.compareTo(tree.getValue()) < 0)
			tree.setLeft(add(val, tree.getLeft()));
		if(val.compareTo(tree.getValue()) > 0)
			tree.setRight(add(val, tree.getRight()));
		return tree;
	}
   
   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder
	public void preOrder()
	{
		preOrder(root);
		System.out.println("\n\n");
	}

	private void preOrder(TreeNode tree)
	{
		if (tree != null){
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder()
	{
		postOrder(root);
		System.out.println("\n\n");
	}

	private void postOrder(TreeNode tree)
	{
		if (tree != null){
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}

	public void revOrder()
	{
		revOrder(root);
		System.out.println("\n\n");
	}

	private void revOrder(TreeNode tree)
	{
		if (tree != null){
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}




	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree == null)
			return 0;
		int left = getNumLevels(tree.getLeft());
		int right = getNumLevels(tree.getRight());
		return left > right ? 1 + left : 1 + right;
	}
   
   // Complete the traversals and the toString method
   // and then each of these:
   
   public void clear()
   {
		root = null;
   }

   public int getNumLeaves()
   {
	   return getNumLeaves(root);
   }

   private int getNumLeaves(TreeNode tree)
   {
	   	if(tree == null)
		   return 0;
		if(tree.getLeft() == null && tree.getRight() == null)
			return 1;
	   	return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());
   }
      
   //getHeight
   	public int getHeight()
	{
		return getHeight(root);
	}
	public int getHeight(TreeNode tree)
	{
		return getNumLevels(tree)-1;
	}

   
  	public int getNumNodes()
	{
		return getNumNodes(root);
	}

	private int getNumNodes(TreeNode tree)
	{
		if(tree == null)
			return 0;
		return 1 + getNumNodes(tree.getLeft()) + getNumNodes(tree.getRight());
	}
   
   //isFull
   	public boolean isFull()
	{
		return isFull(root);
	}

	private boolean isFull(TreeNode tree)
	{
		if(tree == null)
			return false;
		return isFull(tree.getLeft()) == isFull(tree.getRight());
	}

	
	//search
	
	//getSmallest
	public Comparable getSmallest(){
		TreeNode tree = root;
		while(tree != null &&tree.getLeft() != null)
			tree = tree.getLeft();
		return tree.getValue();
	}
	
	//getLargest
	public Comparable getLargest(){
		TreeNode tree = root;
		while(tree != null &&tree.getRight() != null)
			tree = tree.getRight();
		return tree.getValue();
	}
		
   	//getWidth
	   public int getWidth()
	   {
		   return getWidth(root);
	   }
   
	   private int getWidth(TreeNode tree)
	   {
		   if(tree == null)
			   return 0;
		   int myWidth = 1 + getHeight(tree.getLeft())
			return 0;
	   }

	

	//remove



   // Returns a String that represents 
   // an IN-ORDER traversal of the tree.
	public String toString()
	{
		return toString(root);
	}

	private String toString(TreeNode tree)
	{
		if(tree == null)
		return "";
		return toString(tree.getLeft()) + tree.getValue() + toString(tree.getRight());
	}

   public void levelOrder()
   {
      levelOrder(root);
      System.out.println("\n\n");
   }

   private void levelOrder(TreeNode tree)
   {
      if(tree==null)
         return;
   	  
      Queue<TreeNode> level = new LinkedList<TreeNode>();
      level.add(tree);
      while(!level.isEmpty())
      {
         TreeNode node = level.remove();
         out.print(node.getValue() + " ");
         if(node.getLeft()!=null)
         {
            level.add(node.getLeft());
         }
         if(node.getRight()!=null)
         {
            level.add(node.getRight());
         }
      }
   }
}
